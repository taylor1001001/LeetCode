class Solution:
    def calPoints(self, ops: List[str]) -> int:
        records = []
        for i in range(len(ops)):
            if ops[i] == '+':
                records.append(records[len(records)-1]+records[len(records)-2])
            elif ops[i] == 'C':
                records.pop(len(records)-1)
            elif ops[i] == 'D':
                records.append(records[len(records)-1]*2)
            else:
                records.append(int(ops[i]))
        
        return sum(records)
