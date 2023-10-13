package Playstore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ApplicationImplementation {
	static Scanner scanner = new Scanner(System.in);
	static List<UserEntity> userEntities = new ArrayList<UserEntity>();
	static List<ApplicationCategory> applicationCategories = new ArrayList<ApplicationCategory>();
	static List<Application> applications = new ArrayList<Application>();
	static int generateUserId = 99;
	static int generateCategoryId = 99;
	static int generateApplicationId = 99;

	static void addUser(String usertype) {
		System.out.println("*****" + usertype + " Registration Panel*****");

		System.out.println("Enter " + usertype + " name: ");
		String name = scanner.next();

		System.out.println("Enter username: ");
		String username = scanner.next();

		System.out.println("Enter password: ");
		String password = scanner.next();

		userEntities.add(new UserEntity(generateUserId + 1, name, username, password, usertype));

		System.out.println("*****" + usertype + " Added Successfully****");
	}

	static void addCategory() {
		boolean flag = true;
		while (flag) {
			System.out.println("Enter Category Name: ");
			String cat_name = scanner.next();
			System.out.println("Enter Category Descripption");
			String cat_desc = scanner.next();
			applicationCategories.add(new ApplicationCategory(generateCategoryId + 1, cat_name, cat_desc));

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("-----Category Added Successfully-----");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("Want to add more? press any key to continue else 0 to exit...");
			if (scanner.nextInt() == 0) {
				flag = false;
			}
		}
	}

	static void addApplication() {
		boolean flag = true;
		while (flag) {
			boolean applicationFound = false;
			System.out.println("Enter Category ID: ");
			int catId = scanner.nextInt();

			for (int i = 0; i < applicationCategories.size(); i++) {
				if (applicationCategories.get(i).getId() == catId) {
					System.out.println("Enter App Name: ");
					String app_name = scanner.next();
					System.out.println("Enter App Description: ");
					String app_desc = scanner.next();
					System.out.println("Enter App Size: ");
					double app_size = scanner.nextDouble();

					applications.add(new Application(generateApplicationId + 1, app_name, app_desc, app_size,
							applicationCategories.get(i)));
					applicationFound = true;
					break;
				}
			}
			if (applicationFound == true) {
				System.out.println("Application Added Successfully");
				flag = false;
			} else {
				System.out.println("Application Category Not Found! Add Category or Enter Select Correct Category!!");
				flag = false;

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	static void updateCategory() {
		boolean flag = true;
		boolean isCategoryFound = false;
		System.out.println("Enter Category ID: ");
		int cat_id = scanner.nextInt();
		for (int i = 0; i < applicationCategories.size(); i++) {
			if (applicationCategories.get(i).getId() == cat_id) {
				while (flag) {
					System.out.println(
							"1. Update Category Name\n2. Update Category Description\n3. Delete Category\n0. Exit");
					int categoryChoice = scanner.nextInt();
					switch (categoryChoice) {
					case 1:
						System.out.println("Enter new category name: ");
						String cat_name = scanner.next();
						applicationCategories.get(i).setCategory_name(cat_name);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("Category name updated successfully...");
						break;
					case 2:
						System.out.println("Enter new Description: ");
						applicationCategories.get(i).setCategory_desc(scanner.next());
						break;
					case 3:
						applicationCategories.remove(i);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("Category Deleted Successfully...");
						break;
					case 0:
						flag = false;
						break;
					default:
						System.out.println("Invalid Entry...!!");
						break;
					}
				}
				isCategoryFound = true;
			}
		}
		if (isCategoryFound == false) {
			System.out.println("Category not found...!!");
		}
	}

	static void updateApplicationCategory(Application application) {
		System.out.println("Enter New Category ID: ");
		int cat_id = scanner.nextInt();
		applicationCategories.forEach((category) -> {
			if (category.getId() == cat_id) {
				application.setApplicationCategory(category);
			}
		});
		if (application.getApplicationCategory().getId() == cat_id) {
			System.out.println("New Category Updated Successfully");
		} else {
			System.out.println("New Category Updation Failed!! Category Not Found...!!");
		}
	}

	static void updateApplication() {
		System.out.println("Enter App ID: ");
		for (int i = 0; i < applications.size(); i++) {
			if (applications.get(i).getId() == scanner.nextInt()) {
				Scanner sc = new Scanner(System.in);
				boolean flag = true;
				while (flag) {
					System.out.println(
							"1. Update App Name\n2. Update App Description\n3. Update App Size\n4. Update App Category\n0. Exit");
					int key = sc.nextInt();
					switch (key) {
					case 1:
						System.out.println("Enter New App Name: ");
						String app_name = sc.next();
						applications.get(i).setApp_name(app_name);
						System.out.println("Update Successfully");
						break;
					case 2:
						System.out.println("Enter New App Description: ");
						String app_desc = sc.next();
						applications.get(i).setApp_desc(app_desc);
						System.out.println("Update Successfully");
						break;
					case 3:
						System.out.println("Enter New App Size: ");
						double app_size = sc.nextDouble();
						applications.get(i).setSize(app_size);
						System.out.println("Update Successfully");
						break;
					case 4:
						updateApplicationCategory(applications.get(i));
						break;
					case 0:
						flag = false;
						break;
					default:
						System.out.println("Invalid Entry...!! Try Again...");
						break;
					}
				}
				sc.close();
				break;
			}
		}
	}

	static void loginUser(String usertype) {
		System.out.println("*****Welcome to " + usertype + " Login Panel*****");
		System.out.println("Enterm username: ");
		String username = scanner.next();
		System.out.println("Enter Password: ");
		String password = scanner.next();

		for (int i = 0; i < userEntities.size(); i++) {
			boolean exitAddApplicationMenu = true;
			if (userEntities.get(i).getUsername().equals(username)
					&& userEntities.get(i).getPassword().equals(password)) {
				Scanner sc = new Scanner(System.in);

				System.out.println("========Login Successfull========");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				while (exitAddApplicationMenu) {
					if (userEntities.get(i).getUser_type().equalsIgnoreCase("Admin")) {
						System.out.println("1. Add Category\n" + "2. Add Application\n" + "3. Update Category\n"
								+ "4.Update Application\n" + "5. Print Categories\n" + "6. Print Applications\n"
								+ "0. Exit");
					}
					int key = sc.nextInt();
					switch (key) {
					case 1:
						addCategory();
						break;
					case 2:
						addApplication();
						break;
					case 3:
						updateCategory();
						break;
					case 4:
						updateApplication();
						break;
					case 5:
						System.out.println(applicationCategories);
						break;
					case 6:
						System.out.println(applications);
						break;
					case 0:
						exitAddApplicationMenu = false;
						break;
					default:
						System.out.println("Invalid Entry...!!");
						break;
					}
				}
				sc.close();
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean exit = true;
		while (exit) {
			System.out.println("=====Choose Options=====");
			System.out.println("1. Register as Admin\n" + "2. Register as user\n" + "3. Login as Admin\n"
					+ "4. Login as user\n" + "5. Print Admin\n" + "0. Exit");
			int key = sc.nextInt();
			switch (key) {
			case 1:
				addUser("Admin");
				break;
			case 2:
				addUser("Consumer");
				break;
			case 3:
				loginUser("Admin");
				break;
			case 4:
				loginUser("Consumer");
				break;
			case 5:
				System.out.println(userEntities);
				break;
			case 0:
				exit = false;
				break;
			default:
				System.out.println("Invalid option!!");
				break;
			}
		}
		sc.close();
	}
}
