# Interpreter
Java A2

The problem

You will write an interpreter for a tiny machine language | TML. The general form of a machine language instruction is

label instruction register-list

where

label is the label for the line. Other instructions might "jump" to that label.

instruction is the actual instruction. In TML, there are instructions for adding, multiplying and so on, for storing and retrieving integers, and for conditionally branching to other labels (like an if statement).

register-list is the list of registers that the instruction manipulates. Registers are simple, integer, storage areas in computer memory, much like variables. In TML, there are 32 registers, numbered 0, 1, . . . , 31.

TML has the following instructions:
L1 add r s1 s2 Add the contents of registers s1 and s2 and store the result in register r
L1 sub r s1 s2 Subtract the contents of register s2 from the contents of s1 and store the result in register r
L1 mul r s1 s2 Multiply the contents of registers s1 and s2 and store the result in register r
L1 div r s1 s2 Divide (Java integer division) the contents of register s1 by the contents of register s2 and store the result in register r
L1 out s1 Print the contents of register s1 on the Java console (using println)
L1 lin r x Store integer x in register r
L1 bnz s1 L2 If the contents of register s1 is not zero, then make the statement labeled
L2 the next one to execute
