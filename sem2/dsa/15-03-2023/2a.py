class Stack:
    top = -1
    size = 0
    s = []
    def __init__(self, size):
        self.size = size -1
        
    def push(self, data):
        if self.top >= self.size:
            print("Stack Overflow!")
        else:
            self.top += 1
            self.s.append(data)
        
    def pop(self):
        if self.top < 0:
            print("Stack Underflow!")
            return False
        else:
            data = self.s[self.top]
            del self.s[self.top]
            self.top -= 1
            return data
            
    def display(self):
        if self.top < 0:
            print("Stack Underflow!")
            return False
        else:
            for i in range(self.top , -1, -1):
                print(f"|_{self.s[i]}_|")
    
    
            
n = int(input("Enter the size of stack: "))
 
s = Stack(n)
 
flag = True
print("Menu")
print("1.Push")
print("2.Pop")
print("3.Display")
print("4.Exit")
 
while flag:
    opt = int(input("Enter your option: "))
    if opt == 1:
        data = int(input("Enter the element: "))
        s.push(data)
    elif opt == 2:
        data = s.pop()
        if data != False:
            print(f"Popped element is {data}")
    
    elif opt == 3:
        s.display()
        
    elif opt == 4:
        flag = False