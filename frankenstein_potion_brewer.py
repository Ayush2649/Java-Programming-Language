def min_orbs_to_brew(potion, recipe_book, memo):
    if potion not in recipe_book:
        return 0

    if potion in memo:
        return memo[potion]

    result = float('inf')

    for recipe in recipe_book[potion]:
        orbs_required = len(recipe) - 1
        for ingredient in recipe:
            orbs_required += min_orbs_to_brew(ingredient, recipe_book, memo)

        result = min(result, orbs_required)

    memo[potion] = result
    return result

def main():
    n = int(input())
    recipe_book = {}
    memo = {}

    for _ in range(n):
        line = input().strip()
        potion, ingredients = line.split('=')
        ingredient_list = ingredients.split('+')
        if potion not in recipe_book:
            recipe_book[potion] = []
        recipe_book[potion].append(ingredient_list)

    target_potion = input().strip()
    result = min_orbs_to_brew(target_potion, recipe_book, memo)
    print(result)

if __name__ == "__main__":
    main()
