class Solution:
    def solveNQueens(self, n):
        """
        :type n: int
        :rtype: List[List[str]]
        """
        result = []
        array = [None] * n
        if n == 1:
            array[0] = "Q"
            result.append(array)
            return result

        if n < 4:
            return result

        self.placeQueen(0, array, result)
        return result

    def placeQueen(self, n, array, lists):
        if len(array) == n:
            newlist = self.drawResult(array)
            lists.append(newlist)
            return newlist

        for row in range(0, len(array)):
            array[n] = row
            if self.isConflict(array, n):
                self.placeQueen(n+1, array, lists)
                # print(n)
                if n + 1 == len(array):
                    break
        return None


    def isConflict(self, array, column):
        for i in range(0, column):
            if array[i] == array[column]:
                return False
            if abs(array[column] - array[i]) == abs(column - i):
                return False
        return True

    def drawResult(self, array):
        lists = []
        for row in range(0, len(array)):
            string = ""
            for column in range(0, len(array)):
                if array[row] == column:
                    string += "Q"
                else:
                    string += "."
            lists.append(string)
            print(string)
        print()
        return lists
