def power(x, n):
    if n == 0:
        return 1
    return x * power(x, n - 1)

def factorial(n):
    if n == 0 or n == 1:
        return 1
    return n * factorial(n - 1)

def resultat(x, n):
    if n < 0:
        raise ValueError("n должно быть неотрицательным.")
    return power(x, n) / factorial(n)

x = int(input('Введите число x:'))
n = int(input('Введите число n:'))

result = resultat(x, n)
print(f"Результат вычисления для x = {x} и n = {n}: {result}")
