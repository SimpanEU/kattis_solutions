def decrypt():
    message = input()

    days = 0

    for num, m in enumerate(list(message.lower())):

        if num % 3 == 0 and not m == "p":
            days += 1
        if num % 3 == 1 and not m == "e":
            days += 1
        if num % 3 == 2 and not m == "r":
            days += 1

    print(days)


def main():
    decrypt()


if __name__ == "__main__":
    main()
