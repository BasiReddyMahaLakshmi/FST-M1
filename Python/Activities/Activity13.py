list = [1, 3, 5, 7]


def sum_list(numbers):
    sum = 0
    for number in numbers:
        sum += number
    return sum


total = sum_list(list)

print("The sum of all the elements is: ", total)
