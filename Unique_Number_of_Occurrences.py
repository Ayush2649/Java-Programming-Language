class Unique_Number_of_Occurrences: 
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        counter = Counter(arr)
        s = set()
        for v in counter.values():
            if v in s:
                return False
            else:
                s.add(v)
        return True
    
if __name__ == "__main__":
    
    # Example test cases
    arr1 = [1, 2, 2, 1, 1, 3]
    print("Test Case 1: ", uniqueOccurrences(arr1))