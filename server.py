def server():
    inp1 = input().split()
    taskList = input().split()

    minutesGiven = int(inp1[1])
    tasksCompleted = 0

    for task in taskList:

        if minutesGiven >= int(task):
            minutesGiven = minutesGiven - int(task)
            tasksCompleted += 1
        else:
            break

    print(tasksCompleted)


def main():
    server()


if __name__ == "__main__":
    main()
