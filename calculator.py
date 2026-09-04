def read_number(prompt):
	while True:
		value = input(prompt).strip()
		if value.lower() == "q":
			return None
		try:
			return float(value)
		except ValueError:
			print("Please enter a valid number or q to quit.")


def main():
	print("Python Calculator")
	print("Enter q at any prompt to quit.")

	while True:
		first_number = read_number("Enter first number: ")
		if first_number is None:
			break

		operator = input("Enter an operator (+, -, *, /): ").strip()
		if operator.lower() == "q":
			break

		second_number = read_number("Enter second number: ")
		if second_number is None:
			break

		if operator == "+":
			result = first_number + second_number
		elif operator == "-":
			result = first_number - second_number
		elif operator == "*":
			result = first_number * second_number
		elif operator == "/":
			if second_number == 0:
				print("Cannot divide by zero.")
				continue
			result = first_number / second_number
		else:
			print("Unknown operator. Use +, -, *, or /.")
			continue

		print(f"Result: {result}")

	print("Calculator closed.")


if __name__ == "__main__":
	main()
