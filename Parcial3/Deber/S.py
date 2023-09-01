class Task:
    def __init__(self, description, priority):
        self.description = description
        self.priority = priority
        self.completed = False

    def complete(self):
        self.completed = True


class TaskManager:
    def __init__(self):
        self.tasks = []

    def add_task(self, task):
        self.tasks.append(task)

    def list_tasks(self):
        for index, task in enumerate(self.tasks, start=1):
            status = "Done" if task.completed else "Pending"
            print(f"{index}. {task.description} - Priority: {task.priority} - Status: {status}")

    def complete_task(self, task_index):
        if 1 <= task_index <= len(self.tasks):
            task = self.tasks[task_index - 1]
            task.complete()


def main():
    task_manager = TaskManager()

    while True:
        print("1. Add Task")
        print("2. List Tasks")
        print("3. Complete Task")
        print("4. Exit")
        choice = input("Select an option: ")

        if choice == "1":
            description = input("Enter task description: ")
            priority = input("Enter task priority: ")
            task = Task(description, priority)
            task_manager.add_task(task)
            print("Task added.")
        elif choice == "2":
            task_manager.list_tasks()
        elif choice == "3":
            task_manager.list_tasks()
            task_index = int(input("Enter the task number to complete: "))
            task_manager.complete_task(task_index)
            print("Task completed.")
        elif choice == "4":
            break
        else:
            print("Invalid choice. Please select again.")


if __name__ == "__main__":
    main()
