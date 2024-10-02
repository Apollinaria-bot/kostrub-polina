def count_matching_numbers(a, b, c):
    if a == b and b == c:
        return 3
    elif a == b or b == c or a == c:
        return 2
    else:
        return 0


a = int(input("Введите первое число: "))
b = int(input("Введите второе число: "))
c = int(input("Введите третье число: "))


result = count_matching_numbers(a, b, c)
print("Количество совпадающих чисел:", result)
