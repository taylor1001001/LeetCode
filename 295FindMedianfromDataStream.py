from bisect import insort
class MedianFinder(object):

    def __init__(self):
        self.list = []
        

    def addNum(self, num):
        """
        :type num: int
        :rtype: None
        """
        size = len(self.list)
        insort(self.list, num)     
        

    def findMedian(self):
        """
        :rtype: float
        """
        if len(self.list)%2 == 1:
            return self.list[len(self.list)/2]
        else:
            return (self.list[len(self.list)/2] + self.list[len(self.list)/2-1])/2.0
        return 0
