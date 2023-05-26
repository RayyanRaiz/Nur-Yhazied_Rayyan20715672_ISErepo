# Heading
---
## 2. Modularity : Description of Modules
### **(Scenario 1)**
**Submodule : choosingCountry**  
Imports : none  
Exports : choiceCountry (integer)  
Implements the choice of country the user intends to pick for the program, based on the string read within which contatins a list of integers with particular countries next to them. Input is taken from the keyboard for choosing the country, and the output is the retun value.

**Submodule : choosingMonth**  
Imports : none  
Exports : choiceMonth (integer)   
Implements the choice of month the user intends to pick for the program, based on the string read within which contatins a list of integers with the particular months next to them. Input is taken from the keyboard for choosing the month, and the output is the retun value.

**Submodule : countrySeason**  
Imports : pCountry (integer), pMonth(integer)  
Exports : result (String)  
Implements a submodule that imports the choice of country and month picked by the user. From these choices, other certain submodules will be run to obtain the correct result for the season of the specific country's month. Inputs are passed as parameters, and output is based on the submodules called below which will print the result on the screen.

**Submodule : australiaMeteorological**  
Imports : pMonth (integer)  
Exports : seasonAM (String)  
Implements a submodule that considers the "Australian Meteorological" seasons, and depending on the users choice of pMonth, it will return a String (seasonAM), representing one of the "Australian Meteorological" seasons. Also showcases the image of the resulting season. Input is passed as a parameter, and output is a return value printed on the screen(String) plus the associated image of the season displayed in a window.

**Submodule : australiaNoongar**  
Imports : pMonth (integer)  
Exports : seasonAN (String)  
Implements a submodule that considers the "Australian Noongar" seasons, and depending on the users choice of pMonth, it will return a String (seasonAN), representing one of the "Australian Noongar" seasons. Also showcases the image of the resulting season. Input is passed as a parameter, and output is a return value printed on the screen (String) plus the associated image of the season displayed in a window.

**Submodule : spainAndJapan**  
Imports : pMonth (integer)  
Exports : seasonSJ (String)  
Implements a submodule that considers the "Spain and Japan" seasons, and depending on the users choice of pMonth, it will return a String (seasonSJ), representing one of the "Spain and Japan" seasons. Also showcases the image of the resulting season. Input is passed as a parameter, and output is a return value printed on the screen (String) plus the associated image of the season displayed in a window.

**Submodule : mauritius**  
Imports : pMonth (integer)  
Exports : seasonM (String)  
Implements a submodule that considers the "Mauritius" seasons, and depending on the users choice of pMonth, it will return a String (seasonM), representing one of the "Mauritius" seasons. Also showcases the image of the resulting season. Input is passed as a parameter, and output is a return value printed on the screen (String) plus the associated image of the season displayed in a window.

**Submodule : malaysiaAndSriLanka**  
Imports : pMonth (integer)  
Exports : seasonMSL (String)  
Implements a submodule that considers the "Malaysia and Sri Lanka" seasons, and depending on the users choice of pMonth, it will return a String (seasonMSL), representing one of the "Malaysia and Sri Lanka" seasons. Also showcases the image of the resulting season. Input is passed as a parameter, and output is a return value printed on the screen (String) plus the associated image of the season displayed in a window.

### **(Scenario 2)**  
**Submodule : averageTemp (REVISED)**  
Imports : pTemp (double)  
Exports : none
Implemented as the main submodule for the average temperature scenario. Its main role is to call the tempStrings submodule and depending on the imported pTemp value and the average temperature value chosen it will print the output of the analysis to the screen. Input taken from keyboard, and output is based on the tempStrings submodule analysis output.

**Submodule : choosingTemp**  
Imports : none  
Exports : choiceTemp (double)
Implemented as a submodule that asks and takes in a temperature reading inserted by the user. The submodule then returns "choiceTemp" representing their temperature reading as a double. Input is taken from keyboard, and outputs a return value.

**Submodule : tempStrings**  
Imports : pTemp (double), avg (double)  
Exports : none
Implemented as a submodule that contains the results based on the imported "pTemp" (temperature reading by the user) and "avg" (users chosen temperature average based on the chosen city and time). This submodule outputs the results as Strings, and will let the user know if "pTemp" is above or below "avg" by more then five degrees celsius. Input passed as parameters, output is returned as strings printed on the screen.

### **(Other)**  
**Submodule : displayImage**  
Imports : pImagefile (String)
Exports : none
Implemented as a submodule to display specific images based on the import "pImagefile", the image file name matching the String import will be displayed as an image in a new window. Input is passed as a parameter, output is the image displayed in a new window.

## 3. Modularity : Implementation, Reviewing and Refactoring  
### **a) Production Code** XXX  
### **b) Explanation of how good modularity principles are used within the code**  
For the implementation of the software project, modularity has been highly taken into consideration. Modularity is one of the largest aims for this project as it breaks it up into smaller and organised pieces. In this case, submodules have been utilised to represent a sub-part of the program that performs a particular task. Each of these modules depend on each other in creating the final program. In terms of modularity, low coupling and high cohesion is the aim in creating a program with good modularity principles.  


In terms of coupling, the program aims to have as low coupling as possible. This can be seen with the choosingCountry and choosingMonth submodules which have no parameters but only return values. This makes the coupling low as these submodules dont rely on parameters, and are individually performing the act of obtaining a country and a month the user has decided on. For each unique season in a specific country given, a submodule has been made for each to further breakdown the project. Each country with a unique season has a submodule that only has one parameter of pMonth, with only one parameter this helps decrease coupling within the program. For the countrySeason submodule, it relies on two parameters pCountry and pMonth, which utilise the submodules choosingCountry and choosingMonth respectively. The main task of countrySeason is to finalise all the mentioned submodules, and based on the country and month chosen, it calls the specific submodule to output the final result. Although the submodules do rely on eachother in completing the program, the program still demonstrates low coupling as a low amount of parameters were used for each submodule. The submodules also only returned one value and didn't involve any control flags that performed more than one task in a submodule.  

For scenario 2 of the program, we have a similar approach as to scenario 1 in creating the final program. We have a choosingTemp submodule that has no parameters, and its sole purpose is to obtain a temperature reading (double) from the user. In the tempStrings submodule, it takes in two parameters pTemp and avg. This submodule is used to produce the print to screen results, specfically it performs and analysis on how the pTemp and avg values compare to each other. The averageTemp submodule calls in the previous submodules mentioned to have the sole purpose of displaying the menu. This then allows the user to perform analysis on their temperature reading based on the average temperature of the specific city and time of day. Each submodule has minimal parameters and either none or one return value which is the aim of low coupling. 

For both scenarios it is almost impossible to have no coupling at all, since submodules have to be called into other submodules for the whole program to work. But, we can decrease this coupling as shown in this project by specificying the purpose of each submodule, minimising the amount of parameters and return values passed, aswell as having no submodules representing any control flags.  

In terms of cohesion, it is the extent to which a single module does one well-defined task. The project aims to have maximum cohesion as it allows the program to be more comprehensive and understandable. This also allows for easier testing and modifications for future endeavours. 

Cohesion in terms of scenario 1, each submodule name explains the purpose of the specific submodule. For example, choosingCountry and choosingMonth have been separated as their own submodules to increase cohesion as they perform their own specific task. These could have been put into one submodule all together, but that would make testing and comprehension more difficult. Each unqique country season is also split into their own submodules, as they perform their one wel-defined task specifically. Rather than having all the seasons in one submodules, by breaking it down and incrasing cohesion, it makes the program much more easier to understand. For the submodule countrySeason, its one well-defined task is picking the correct country, thus calling the submodule for that specific country's season then passing through the parameter of pMonth to output the final result. This may represent two different data being used due to the two parameters, but one parameter is only used to enter the correct case statment. Then the second parameter is passed through the specific submodule, therefore the countrySeason submodule is still performing only one well-defined task process.

For scenario 2, its specific tasks are also seperated into their specific submodules. For example, the chooosingTemp submodules main task is to retrieve a double from the user that represents a given tempertaure reading. Another submodule called tempStrings, utilises that temperature reading as a parameter named "pTemp". It also has another parameter called "avg" where the main task of this submodule is to compare these two parameters and perform an analysis on wheter pTemp is below, above or the same as avg. In addition, if pTemp is above or below avg by more than five degrees celsius, the user will be notified by an output thats printed to the screen. The final submodule averageTemp, is used to call the previously mentioned submodules and display the menu allowing the user to go through the process of analysis. It has one parameter of the users temperature reading as pTemp. Its main task is by first asking which city and time of day they would like to compare to, and then calling the tempStrings submodule with the pTemp parameter passed through to perform the analysis. The submodules one well-defined task is bringing the whole program together and displaying the menu needed for the process. This showcases the programs high level of cohesion as each submodule performs its own task, and is later called into a larger submodule that performs the whole program sequentially.

For both scenarios, their main submodules are called into the main. Looking at the main, the cohesion can be seen as each user input for example choosing the country, month and temperature are all seperated tasks. In which, the returned values are further utilised in the main submodules of both scenarios. This further improves overall cohesion as when the program is seperated into particular tasks, it helps with flexibility and maintainability of the final program.

Redundancy of the whole program is another building block in improving modularity in the final program. We aim to avoid repetition and redundancy as it increases complexity with no real benefit. The program aims to reuse code to create a much smaller system as it is much easier to test and inspect. In scenario 1, we reused code depending on if certain countries had the same season patterns and names. If they did, they would be combined into one submodule with the name of the submodules representing the specific countries. This helps to reuse code but also helps decreases coupling as less submodules are being made. For scenario 2, the submodule tempString was created since its main task was its analysis between the users temperature reading and their chosen average temperature. In the main program, this code would have been repetitive as the analysis could be carried out in four different paths. Therefore the submodule tempString was created to be reused, which would avoid redundancy and repition overall.

These are the different ways the program aims to achieve good modularity principles through low coupling, high cohesion and the avoidance of redundancy.

### **c) Short Review Checklist**  
Coupling  
   1. Is the code free of global variables?  
   2. Do method calls have less than 6 parameters?
   3. Are method calls reduced as much as possible?

Cohesion  
   1. Is the code control flag free?  
   2. Is the submodule performing only 1 task?
   3. Is the submodule calling parameters that are related to eachother?

Redundancy  
   1. Does the code contain no unneccesary repetition?  
   2. Do parts of each submodule deal with the same data?
   3. Is there no unneccesary complexity in the code?  

### **d) Code Review** 

|Item| Checklist Question| Description If "No"|
|:-|:-|:-|
|averageTemp|Q3 (Coupling)|The method calls have not been reduced as much as possible. The choosingTemp submodule would be repetitively called for each case in the switch case statment.
 
### **e) Issues Identified, Refactor Code, Explain How It Has Improved**  
This issue has been changed so the choosingTemp submodule is acually called within main and stored in a variable. The averageTemp module has been changed to include the pTemp parameter. All together, this helps reduce coupling as less calls are made. Looking at main now, scenario 2 is much more comprehensible since before it would just represent the averageTemp submodule with no parameters. Now with the parameter included, the code is much more understandable in what it is attempting to achieve.

## **4. Test Designs (Black Box Testing)** 
## **5. Test Designs (White Box Testing)**  
## **6. Test Implementation**  
## **7. Ethics and Professionalism** 


 




[Link here](https://rootsofraiz.com)