def calc_winner():
    stones = input()
    if int(stones) % 2 == 0:
        print('Bob')
    else:
        print('Alice')

def main():
    calc_winner()

if __name__ == "__main__":
    main()