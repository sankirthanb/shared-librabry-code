package com.san.builds;

class Calculator {
    def jenkins
    Calculator (jenkins) {
        this.jenkins = jenkins;
    }
}

def add (num1,num2) {
    return num1 + num2
}


def mul (num1,num2) {
    return num1 * num2
}

