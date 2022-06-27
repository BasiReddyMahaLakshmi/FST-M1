def Sum(num):
    if num:
        return num + Sum(num - 1)
    else:
        return 0


res = Sum(10)

print(res)
