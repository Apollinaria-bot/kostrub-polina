def count_words(input_string):
    words = input_string.rstrip('.').split()
    return len(words)


input_string = "Это пример строки, которая заканчивается точкой."
word_count = count_words(input_string)
print(f"Количество слов в строке: {word_count}")
