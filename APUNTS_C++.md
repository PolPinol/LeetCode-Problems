# Apunts C++ - LeetCode Problemes



## Introduction

#### Print
`cout << "Hello World!";`

#### Scanner
`cin >> x;`

#### Types
`bool a = true;`
`string b = "AAA";`

#### Constants
`const float PI = 3.14;`

#### Math

```
cout << max(5, 10);
cout << min(5, 10);
cout << sqrt(64);
cout << round(2.6);
cout << log(2);
```

#### Initialize arrays
`int myNum[3] = {10, 20, 30};`

#### Get the Size of an Array
`sizeof(myNumbers)`

#### How many elements an array has
`sizeof(myNumbers) / sizeof(int)`

#### Struct
```
struct {
  int myNum;
  string myString;
} myStructure;
```

#### Default parameter on a function call
```
void myFunction(string country = "Norway") {
  cout << country << "\n";
}

myFunction();
myFunction("USA");
```

#### Classes
Primer exemple senzill:
```
class MyClass {      
  public:             
    int myNum;        
    string myString;
    void myMethod2();
    
    void myMethod() {
      cout << "Hello World!";
    }
};

void MyClass::myMethod2() {
  cout << "Hello World!";
}
```

Exemple amb constructor:
```
class Car {
  public:
    int year;     
    Car(int z) {
      year = z;
    }
};

int main() {
  Car carObj1(1999);
  return 0;
}

```

Exemple amb constructor:
```
class Car {
  public:
    int year;     
    Car(int z);
};

Car::Car(int z) {
  year = z;
}

int main() {
  Car carObj1(1999);
  return 0;
}

```

