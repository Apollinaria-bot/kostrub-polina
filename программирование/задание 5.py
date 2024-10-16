def max_consecutive(sequence):
  max_count = 0
  current_count = 1
  previous_number = sequence[0]

  for number in sequence[1:]:
    if number == previous_number:
      current_count += 1
    else:
      max_count = max(max_count, current_count)
      current_count = 1
    previous_number = number

  return max_count


sequence = [1, 2, 2, 2, 3, 3, 3, 3, 3, 0]
max_consecutive_count = max_consecutive(sequence)
print(f"Наибольшее число подряд идущих элементов, равных друг другу: {max_consecutive_count}")


