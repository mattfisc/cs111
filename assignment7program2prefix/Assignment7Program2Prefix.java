/*
 * By:     Matthew Fischer
 * Date:   03/24/2019
 * Program 2 and Extra Credit
 */
package assignment7program2prefix;

import java.util.Stack;

/**
 *
 * @author Matthew Fischer
 */
public class Assignment7Program2Prefix {

    public static void main(String[] args) {
        String infix = "(X+Y)*Z";
        String postfix = "";
        Stack<Character> s = new Stack<Character>();
        
        // Program Objective
        System.out.println("This program converts Infix equations to Postfix");
        
        for(int i = 0;i < infix.length();i++){
            char ch = infix.charAt(i);
            
            switch(ch){
                case '(':
                    s.push(ch);
                    break;
                case ')':
                    while(true){
                        char temp = s.pop();
                        // add to stack
                        if(temp == '(')
                            break;
                        else
                            postfix += temp;
                    }
                    break;
                case '*':
                case '/':
                case '+':
                case '-':
                    // stack is empty
                    if(s.isEmpty())
                        s.push(ch);
                    else{
                        while(true){
                            char temp = s.peek();
                            if(temp == '*' || temp == '/')
                                postfix += s.pop();
                            else
                                break;
                        }
                        s.push(ch);
                    }
                    break;
                // Character
                default:
                    // assume character is alphabetic
                    postfix += ch;  
            }
            
            while(i == infix.length()-1 && !s.isEmpty())
                postfix += s.pop();
            
        }
        System.out.println("Infix : " + infix);
        System.out.println("Postfix : " + postfix);
    }
    
}
/*
---------- Build 1 -----------
run:
This program converts Infix equations to Postfix
Infix : A+B
Postfix : AB+
BUILD SUCCESSFUL (total time: 0 seconds)
--------- Build 2 --------------
run:
This program converts Infix equations to Postfix
Infix : X+Y*Z/X
Postfix : XYZ*X/+
BUILD SUCCESSFUL (total time: 0 seconds)
----------Build 3 --------------
run:
This program converts Infix equations to Postfix
Infix : A+B*C*D+E
Postfix : ABC*D*E++
BUILD SUCCESSFUL (total time: 0 seconds)


------- Extra Credit build 1 ---------------
run:
This program converts Infix equations to Postfix
Infix : (X+Y)*Z
Postfix : XY+Z*
BUILD SUCCESSFUL (total time: 0 seconds)
------ Extra Credit build 2 ---------------
run:
This program converts Infix equations to Postfix
Infix :  (X+Y)/(X-Y)
Postfix :  XY+XY-/
BUILD SUCCESSFUL (total time: 0 seconds)
-------------------------------------------

*/