class Stack:

    top = -1

    size = 0

    s = []

    def __init__(self, size):

        self.size = size -1

    def isempty(self):
        if self.top == -1:
            return True
        return False

    def isfull(self):
        if self.top == size:
            return True
        return False   

    def push(self, data):

        if self.top >= self.size:

            print("Stack Overflow!")

        else:

            self.top += 1

            self.s.append(data)

        

    def pop(self):

        if self.top < 0:

            print("Stack Underflow!")


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

    

    
def isoperator(c):
    if c == '*'or c== '+' or c== '-' or c == '/' or c == '$' or c == '^':
        return True
    return False

def getPrecedence(c):
    if c=='^':
        return 3 
    elif c=='*' or c=='/' or c=='$':
        return 2
    elif c=='+' or c=='-':
        return 1
    else:
	       return 0
        
s=Stack(50)

infix = input("Enter the infix expression: ")
postfix=""
for c in infix:
    if c == '(':
        s.push(c)
    elif c == ')':
        flag = s.pop()
        while flag != '(':
            postfix += flag
            flag = s.pop()
    elif c.isalpha():
        postfix += c
    elif isoperator(c):
        flag = s.pop()
        while (not s.isempty()) and (getPrecedence(flag) > getPrecedence(c) ) and flag != '(':
            postfix += flag
            flag = s.pop()
            
        s.push(c)
    else:
        
        while not s.isempty:
            postfix += s.pop()
            
print(postfix)
    
        


 

