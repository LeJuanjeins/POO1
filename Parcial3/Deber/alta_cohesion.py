class UserManager:
    def __init__(self):
        self.users = []

    def add_user(self, user):
        self.users.append(user)
        print(f"User '{user}' added.")

    def remove_user(self, user):
        if user in self.users:
            self.users.remove(user)
            print(f"User '{user}' removed.")
        else:
            print(f"User '{user}' not found.")

    def list_users(self):
        print("User list:")
        for user in self.users:
            print(user)

def main():
    user_manager = UserManager()

    while True:
        print("1. Add User")
        print("2. Remove User")
        print("3. List Users")
        print("4. Exit")
        choice = input("Select an option: ")

        if choice == "1":
            username = input("Enter username: ")
            user_manager.add_user(username)
        elif choice == "2":
            username = input("Enter username: ")
            user_manager.remove_user(username)
        elif choice == "3":
            user_manager.list_users()
        elif choice == "4":
            break
        else:
            print("Invalid choice. Please select again.")

if __name__ == "__main__":
    main()
