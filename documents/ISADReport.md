# ISAD1000 Assignment (Weather Software Tools)
## Name : Rayyan Nur Yhazied
## Student ID : 20715672
## Practical Class : Tuesday (4 - 6pm) in 314.219  
![Curtin Logo](curtin.jpg)
***
## **1. Introduction**
This documentation aims to showcase a solution to an issue based on the given scenarios provided. These scenarios are utilised in a larger educational software project that is developing software tools to support learning about the weather. Scenario one describes finding the season of the year when a country name and the month of year is given. Scenario two describes finding whether a given temperature reading is above or below the average temperature of a city (Morning or Evening). In addition, if the difference is more than 5⁰C an additional message will be shown.

The documentation starts off by defining the specific submodules needed for the program which solves the issues of scenario one and scenario two above. Once these submodules are defined, implementation of the program commences and throughout this process modularity principles are discussed. Reviewing and refactoring of the program was a major part in making sure modularity principles were followed with high standards. A review checklist was created to fully check the code for any modularity issues, and the program was further refactored when issues were found. Submodules were revised throughout the process to create the most optimal program.

Once the program was satisfactory in terms of modularity, testing occurred. At first this included black box testing, this testing was done for the majority of the submodules through equivalence partitioning and boundary value analysis. Test cases were created through these methods, setting up for the actual testing that was going to commence. White box testing was also performed, where test cases were created with a white-box approach for only certain submodules. Test implementation commenced when all the test cases for white box and black box testing were ready. Java was used in creating these test suite files, and any assertion errors that were found helped to refactor the original program even more, thus improving it.

Ethics and professionalism was also discussed in terms of the program. Scenarios were created regarding how a lack of ethics and professionalism could result in harmful effects when using the program. Identifying these ethical issues either through the ACS or IEEE-CS Ethical guidelines gave helpful suggestions in avoiding these ethical and professional issues in the software.  
***

## **2. Modularity : Description of Modules**
I have chosen to implement these submodules as I have attempted to solve this issue by separating each submodule into their own tasks. Each step that is performed from the start of the program to the very end of the program is broken up into their own submodules. This creates a much easier and comprehensive understanding of the final program. I have assumed that all the interactions of the user when using the program is through menu options. A list of options will be provided with numbers on the side corresponding to the following action. All the user has to do is input the number corresponding to the action to navigate the program. I have also assumed that both scenarios are considered in one program, and that at the start, the user is able to choose whether they want to navigate through scenario one or scenario two.
### **(Scenario 1)**
**Submodule : choosingCountry**  
Imports : none  
Exports : choiceCountry (integer)  
Implements the choice of country the user intends to pick for the program, based on the string read within which contains a list of integers with particular countries next to them. Input is taken from the keyboard for choosing the country, and the output is the return value.

**Submodule : choosingMonth**  
Imports : none  
Exports : choiceMonth (integer)  
Implements the choice of month the user intends to pick for the program, based on the string read within which contains a list of integers with the particular months next to them. Input is taken from the keyboard for choosing the month, and the output is the return value.

**Submodule : countrySeason**  
Imports : pCountry (integer), pMonth(integer)  
Exports : result (String)  
Implements a submodule that imports the choice of country and month picked by the user. From these choices, other certain submodules will be run to obtain the correct result for the season of the specific country's month. Inputs are passed as parameters, and output is based on the submodules called below which will print the result on the screen.

**Submodule : australiaMeteorological**  
Imports : pMonth (integer)  
Exports : seasonAM (String)  
Implements a submodule that considers the "Australian Meteorological" seasons, and depending on the user's choice of pMonth, it will return a String (seasonAM), representing one of the "Australian Meteorological" seasons. Also showcases the image of the resulting season. Input is passed as a parameter, and output is a return value printed on the screen(String) plus the associated image of the season displayed in a window.

**Submodule : australiaNoongar**  
Imports : pMonth (integer)  
Exports : seasonAN (String)  
Implements a submodule that considers the "Australian Noongar" seasons, and depending on the user's choice of pMonth, it will return a String (seasonAN), representing one of the "Australian Noongar" seasons. Also showcases the image of the resulting season. Input is passed as a parameter, and output is a return value printed on the screen (String) plus the associated image of the season displayed in a window.

**Submodule : spainAndJapan**  
Imports : pMonth (integer)  
Exports : seasonSJ (String)  
Implements a submodule that considers the "Spain and Japan" seasons, and depending on the user's choice of pMonth, it will return a String (seasonSJ), representing one of the "Spain and Japan" seasons. Also showcases the image of the resulting season. Input is passed as a parameter, and output is a return value printed on the screen (String) plus the associated image of the season displayed in a window.

**Submodule : mauritius**  
Imports : pMonth (integer)  
Exports : seasonM (String)  
Implements a submodule that considers the "Mauritius" seasons, and depending on the user's choice of pMonth, it will return a String (seasonM), representing one of the "Mauritius" seasons. Also showcases the image of the resulting season. Input is passed as a parameter, and output is a return value printed on the screen (String) plus the associated image of the season displayed in a window.

**Submodule : malaysiaAndSriLanka**  
Imports : pMonth (integer)  
Exports : seasonMSL (String)  
Implements a submodule that considers the "Malaysia and Sri Lanka" seasons, and depending on the user's choice of pMonth, it will return a String (seasonMSL), representing one of the "Malaysia and Sri Lanka" seasons. Also showcases the image of the resulting season. Input is passed as a parameter, and output is a return value printed on the screen (String) plus the associated image of the season displayed in a window.

### **(Scenario 2)**  
**Submodule : averageTemp (REVISED)**  
Imports : pTemp (double)  
Exports : none
Implemented as the main submodule for the average temperature scenario. Its main role is to call the city/time submodules and depending on the imported pTemp value and the average temperature value chosen it will print the output of the analysis to the screen. Input taken from the keyboard, and output is based on the city/time submodule analysis output.

**Submodule : choosingTemp**  
Imports : none  
Exports : choiceTemp (double)
Implemented as a submodule that asks and takes in a temperature reading inserted by the user. The submodule then returns "choiceTemp" representing their temperature reading as a double. Input is taken from keyboard, and outputs a return value.

**Submodule : tempStrings (REMOVED)**  
Imports : pTemp (double), avg (temp)  
Exports : choiceTemp (double)
Implemented as a submodule where the pTemp value is compared to the average temperature value (avg). This submodule notifies if pTemp is above or below this average. It also notifies if pTemp is above or below the average temperature by more than 5 degrees celsius. Input is passed as a parameter and the output is the analysis which is printed to the screen.

**Submodule : perthMorning (REVISED)**  
Imports : pTemp (double)
Exports : none
Implemented as a submodule for perthMorning where the pTemp value is compared to the average temperature value of 18.2 degrees celsius. This submodule notifies if pTemp is above or below this average. It also notifies if pTemp is above or below the average temperature by more than 5 degrees celsius. Input is passed as a parameter and the output is the analysis which is printed to the screen.

**Submodule : perthAfternoon (REVISED)**  
Imports : pTemp (double)
Exports : none
Implemented as a submodule for perthAfternoon where the pTemp value is compared to the average temperature value of 23.0 degrees celsius. This submodule notifies if pTemp is above or below this average. It also notifies if pTemp is above or below the average temperature by more than 5 degrees celsius. Input is passed as a parameter and the output is the analysis which is printed to the screen.

**Submodule : adelaideMorning (REVISED)**  
Imports : pTemp (double)
Exports : none
Implemented as a submodule for adelaideMorning where the pTemp value is compared to the average temperature value of 16.5 degrees celsius. This submodule notifies if pTemp is above or below this average. It also notifies if pTemp is above or below the average temperature by more than 5 degrees celsius. Input is passed as a parameter and the output is the analysis which is printed to the screen.

**Submodule : adelaideAfternoon (REVISED)**  
Imports : pTemp (double)
Exports : none
Implemented as a submodule for adelaideAfternoon where the pTemp value is compared to the average temperature value of 21.0 degrees celsius. This submodule notifies if pTemp is above or below this average. It also notifies if pTemp is above or below the average temperature by more than 5 degrees celsius. Input is passed as a parameter and the output is the analysis which is printed to the screen.


### **(Other)**  
**Submodule : displayImage**  
Imports : pImagefile (String)
Exports : none
Implemented as a submodule to display specific images based on the import "pImagefile", the image file name matching the String import will be displayed as an image in a new window. Input is passed as a parameter, output is the image displayed in a new window.

## **3. Modularity : Implementation, Reviewing and Refactoring** 
To run the production code with the correct commands, make sure to be in the correct directory, then follow below:  
(You must compile the program first before running.) 
***
![Run Production Code](runprod.png)
***

### **How Good Modularity Principles Are Used Within The Code**  
For the implementation of the software project, modularity has been highly taken into consideration. Modularity is one of the largest aims for this project as it breaks it up into smaller and organised pieces. In this case, submodules have been utilised to represent a sub-part of the program that performs a particular task. Each of these modules depend on each other in creating the final program. In terms of modularity, low coupling and high cohesion is the aim in creating a program with good modularity principles.  


In terms of coupling, the program aims to have as low coupling as possible. This can be seen with the choosingCountry and choosingMonth submodules which have no parameters but only return values. This makes the coupling low as these submodules don't rely on parameters, and are individually performing the act of obtaining a country and a month the user has decided on. For each unique season in a specific country given, a submodule has been made for each to further breakdown the project. Each country with a unique season has a submodule that only has one parameter of pMonth, with only one parameter this helps decrease coupling within the program. For the countrySeason submodule, it relies on two parameters pCountry and pMonth, which utilise the submodules choosingCountry and choosingMonth respectively. The main task of countrySeason is to finalise all the mentioned submodules, and based on the country and month chosen, it calls the specific submodule to output the final result. Although the submodules do rely on each other in completing the program, the program still demonstrates low coupling as a low amount of parameters were used for each submodule. The submodules also only returned one value and didn't involve any control flags that performed more than one task in a submodule.  

For scenario 2 of the program, we have a similar approach as to scenario 1 in creating the final program. We have a choosingTemp submodule that has no parameters, and its sole purpose is to obtain a temperature reading (double) from the user. In the city/time submodules, it takes in parameter pTemp. These submodules are used to produce the print to screen results, which specifically performs an analysis on how the pTemp and avg values compare to each other. The averageTemp submodule calls in the previous submodules mentioned to have the sole purpose of displaying the menu. This then allows the user to perform analysis on their temperature reading based on the average temperature of the specific city and time of day. Each submodule has minimal parameters and either none or one return value which is the aim of low coupling. 

For both scenarios it is almost impossible to have no coupling at all, since submodules have to be called into other submodules for the whole program to work. But, we can decrease this coupling as shown in this project by specifying the purpose of each submodule, minimising the amount of parameters and return values passed, as well as having no submodules representing any control flags.  

In terms of cohesion, it is the extent to which a single module does one well-defined task. The project aims to have maximum cohesion as it allows the program to be more comprehensive and understandable. This also allows for easier testing and modifications for future endeavours. 

Cohesion in terms of scenario 1, each submodule name explains the purpose of the specific submodule. For example, choosingCountry and choosingMonth have been separated as their own submodules to increase cohesion as they perform their own specific task. These could have been put into one submodule all together, but that would make testing and comprehension more difficult. Each unique country season is also split into their own submodules, as they perform their one well-defined task specifically. Rather than having all the seasons in one submodule, by breaking it down and increasing cohesion, it makes the program much easier to understand. For the submodule countrySeason, its one well-defined task is picking the correct country, thus calling the submodule for that specific country's season then passing through the parameter of pMonth to output the final result. This may represent two different data being used due to the two parameters, but one parameter is only used to enter the correct case statement. Then the second parameter is passed through the specific submodule, therefore the countrySeason submodule is still performing only one well-defined task process.

For scenario 2, its specific tasks are also separated into their specific submodules. For example, the choosingTemp submodule's main task is to retrieve a double from the user that represents a given temperature reading. The submodules corresponding to the city/time, utilises the temperature reading as a parameter named "pTemp". Each city/time submodule has their own average temperature to compare the imported pTemp to, which will then allow the analysis to be performed. In addition, if pTemp is above or below average by more than five degrees celsius, the user will be notified by an output that's printed to the screen. The final submodule averageTemp, is used to call the previously mentioned submodules and display the menu allowing the user to go through the process of analysis. It has one parameter of the user's temperature reading as pTemp. Its main task is by first asking which city and time of day they would like to compare to, and then calling the submodule for that city/time with the pTemp parameter passed through to perform the analysis. The submodule's one well-defined task is bringing the whole program together and displaying the menu needed for the process. This showcases the program's high level of cohesion as each submodule performs its own task, and is later called into a larger submodule that performs the whole program sequentially.

For both scenarios, their main submodules are called into the main. Looking at the main, the cohesion can be seen as each user input, for example, choosing the country, month and temperature are all separate tasks. In which, the returned values are further utilised in the main submodules of both scenarios. This further improves overall cohesion as when the program is separated into particular tasks, it helps with flexibility and maintainability of the final program.

Redundancy of the whole program is another building block in improving modularity in the final program. We aim to avoid repetition and redundancy as it increases complexity with no real benefit. The program aims to reuse code to create a much smaller system as it is much easier to test and inspect. In scenario 1, we reused code depending on if certain countries had the same season patterns and names. If they did, they would be combined into one submodule with the name of the submodules representing the specific countries. This helps to reuse code but also helps decrease coupling as less submodules are being made. For scenario 2, revisions had to be made to split the analysis up into four different parts corresponding to the four different city/time submodules. I originally had the analysis all in one submodule, but this meant it would be harder to perform testing. Therefore we repeated this code for each city/time to make it so only one parameter is passed through the submodules each time. This helped to reduce coupling within the program as well as increase cohesion as now the separate city/time submodules perform their one well-defined task for the analysis of that specific city/time. A balance was created in increasing repetition, but also improving other aspects of the program for testing such as cohesion and coupling.

These are the different ways the program aims to achieve good modularity principles through low coupling, high cohesion and the avoidance of redundancy.

### **Short Review Checklist**  
Coupling  
   1. Is the code free of global variables?  
   2. Do method calls have less than 6 parameters?
   3. Are method calls reduced as much as possible?

Cohesion  
   1. Is the code control flag free?  
   2. Is the submodule performing only 1 task?
   3. Is the submodule calling parameters that are related to each other?

Redundancy  
   1. Does the code contain no unnecessary repetition?  
   2. Do parts of each submodule deal with the same data?
   3. Is there no unnecessary complexity in the code?  

### **Code Review** 

|Item| Checklist Question| Description If "No"|
|:-|:-|:-|
|averageTemp|Q3 (Coupling)|The method calls have not been reduced as much as possible. The choosingTemp submodule would be repetitively called for each case in the switch case statement.
|tempStrings(REMOVED)|Q2 (Cohesion)|This original submodule was performing the analysis for all the city/times within the program. I have decided to split the module so that each city/time has their own submodules for analysis.
 
### **Issues Identified, Refactor Code, Explain How It Has Improved**   
The first issue has been changed so that the choosingTemp submodule is now called within main and stored in a variable. The averageTemp submodule has been changed to include the pTemp parameter. All together, this helps reduce coupling as less calls are made. In main, scenario two is much more comprehensible as before it would just represent the averageTemp submodule doing all the work with no parameters. Now with the parameter pTemp included, the code is much more understandable in what it is attempting to achieve.  
***
**Average Temp Submodule**  
![average temp submodule](one.png)  
**Main**  
![main](main.png)
***
The second issue has been changed to split up the original tempStrings submodule which was performing the analysis for all the city/times. It has been improved by creating submodules for each city/time which would perform their own analysis based on the city/time's average temperature. This helps with further testing and showcases that each analysis is performed within their one defined submodule. Although repetition within the program had to be increased, a balance was needed. This balance helped to improve cohesion as well as reduce coupling as now the analysis submodules only have to pass through one parameter. The city/time submodules are now called individually, rather than one submodule performing the whole analysis. The original tempStrings submodule acted as a control flag since two parameters were passed through. One of which was the average temperature parameter, which would change up the whole outcome of the analysis.  
*** 
### **BEFORE :**
**tempStrings submodule (REMOVED)**   
![tempstrings submodule](tempstrings.png)  
### **AFTER :**
**perthMorning submodule (REVISED)**  
![perthMorn submodule](perthmorn.png)
***

## **4. Test Designs (Black Box Testing)**  
The assumptions for the black box testing section is that for the program, only integers will be tested. Since the program is purely navigated from the menu options, only integers will be inserted the majority of the time. The only exception is when a temperature reading is needed in scenario two. Another exception is when a submodule returns a string, the string will be tested in this case for black box testing.

I have done the test design for each submodule so that for any possible input/import the submodule can receive, there is a test case for any possible input/import. This makes sure that all return values are taken into consideration and show the correct output. The test data for some of the submodules don't include different data types as they have been handled in previous submodules that take in the user choices.
***
### **Equivalence Partitioning**  
**australiaMeteorological submodule** 
|Category  (pMonth)| Test Data (pMonth)| Expected Result|
|:-|:-|:-|
|pMonth = 12 or 1<= pMonth <=2|2|"Summer"|
|3<= pMonth <=5|5|"Autumn"|
|6<= pMonth <=8|6|"Winter"|
|9<= pMonth <=11|11|"Spring"|
|pMonth <= 0|-8|"error"|
|pMonth >= 13|15|"error"|  

**australiaNoongar submodule** 
|Category  (pMonth)| Test Data (pMonth)| Expected Result|
|:-|:-|:-|
|pMonth = 1 or pMonth = 12|1|"Birak"|
|2<= pMonth <=3|2|"Bunuru"|
|4<= pMonth <=5|5|"Djeran"|
|6<= pMonth <=7|6|"Makuru"|
|8<= pMonth <=9|8|"Dijiba"|
|10<= pMonth <=11|10|"Kambarang"|
|pMonth <= 0|-7|"error"|
|pMonth >= 13|16|"error"|  

**spainAndJapan submodule** 
|Category  (pMonth)| Test Data (pMonth)| Expected Result|
|:-|:-|:-|
|pMonth = 12 or 1<= pMonth <=2|1|"Winter"|
|3<= pMonth <=5|3|"Spring"|
|6<= pMonth <=8|6|"Summer"|
|9<= pMonth <=11|11|"Autumn"|
|pMonth <= 0|-19|"error"|
|pMonth >= 13|18|"error"|

**mauritius submodule** 
|Category  (pMonth)| Test Data (pMonth)| Expected Result|
|:-|:-|:-|
|11<= pMonth <=12 or 1<= pMonth <=4|3|"Summer"|
|pMonth = 5|5|"Autumn"|
|6<= pMonth <=9|6|"Winter"|
|pMonth = 10|10|"Spring"|
|pMonth <= 0|-20|"error"|
|pMonth >= 13|20|"error"|  

**malaysiaAndSriLanka submodule** 
|Category  (pMonth)| Test Data (pMonth)| Expected Result|
|:-|:-|:-|
|pMonth = 12 or 1<= pMonth <=2|1|"Northeast Monsoon"|
|3<= pMonth <=4 or 10<= pMonth <=11|3|"Inter-monsoon"|
|5<= pMonth <=9|5|"Southeast-monsoon"|
|pMonth <= 0|-21|"error"|
|pMonth >= 13|22|"error"|

**perthMorning submodule** 
|Category  (pTemp)| Test Data (pTemp)| Expected Result|
|:-|:-|:-|
|pTemp = 18.2 |18.2|"18.2 is the same as the average temperature of 18.2"|
|13.2 <= pTemp < 18.2|16.0|"16.0 is below the average temperature of 18.2"|
|18.2 < pTemp <= 23.2|22.0|"22.0 is above the average temperature of 18.2"|
|pTemp < 13.2 |7.0|"7.0 is below the average temperature of 18.2\n7.0 is below the average temperature of 18.2 by more than 5 degrees celsius"|
|pTemp > 23.2 |27.0|"27.0 is above the average temperature of 18.2\n27.0 is above the average temperature of 18.2 by more than 5 degrees celsius"|

**perthAfternoon submodule** 
|Category  (pTemp)| Test Data (pTemp)| Expected Result|
|:-|:-|:-|
|pTemp = 23.0 |23.0|"23.0 is the same as the average temperature of 23.0"|
|18.0 <= pTemp < 23.0|19.0|"19.0 is below the average temperature of 23.0"|
|23.0 < pTemp <= 28.0|25.0|"25.0 is above the average temperature of 23.0"|
|pTemp < 18.0 |15.0|"15.0 is below the average temperature of 23.0\n15.0 is below the average temperature of 23.0 by more than 5 degrees celsius"|
|pTemp > 28.0 |30.0|"30.0 is above the average temperature of 23.0\n30.0 is above the average temperature of 23.0 by more than 5 degrees celsius"|

**adelaideMorning submodule** 
|Category  (pTemp)| Test Data (pTemp)| Expected Result| 
|:-|:-|:-|
|pTemp = 16.5 |16.5|"16.5 is the same as the average temperature of 16.5"|
|11.5 <= pTemp < 16.5|15.0|"15.0 is below the average temperature of 16.5"|
|16.5 < pTemp <= 21.5|17.0|"17.0 is above the average temperature of 16.5"|
|pTemp < 11.5 |10.0|"10.0 is below the average temperature of 16.5\n10.0 is below the average temperature of 16.5 by more than 5 degrees celsius"|
|pTemp > 21.5 |25.0|"25.0 is above the average temperature of 16.5\n25.0 is above the average temperature of 16.5 by more than 5 degrees celsius"|

**adelaideAfternoon submodule** 
|Category  (pTemp)| Test Data (pTemp)| Expected Result| 
|:-|:-|:-|
|pTemp = 21.0 |21.0|"21.0 is the same as the average temperature of 21.0"|
|16.0 <= pTemp < 21.0|19.0|"19.0 is below the average temperature of 21.0"|
|21.0 < pTemp <= 26.0|23.0|"23.0 is above the average temperature of 21.0"|
|pTemp < 16.0 |10.0|"10.0 is below the average temperature of 21.0\n10.0 is below the average temperature of 21.0 by more than 5 degrees celsius"|
|pTemp > 26.0 |28.0|"28.0 is above the average temperature of 21.0\n28.0 is above the average temperature of 21.0 by more than 5 degrees celsius"|  

### **Boundary Value Analysis**  
**australiaMeteorological submodule** 
|Boundary| Test Data| Expected Result| 
|:-|:-|:-|
|Between Summer and Autumn|pMonth = 2, pMonth = 3|"Summer","Autumn"|
|Between Autumn and Winter|pMonth = 5, pMonth = 6|"Autumn","Winter"|
|Between Winter and Spring|pMonth = 8, pMonth = 9|"Winter","Spring"|
|Between Spring and Summer|pMonth = 11, pMonth = 12|"Spring","Summer"|

**australiaNoongar submodule** 
|Boundary| Test Data| Expected Result| 
|:-|:-|:-|
|Between Birak and Bunuru|pMonth = 1, pMonth = 2|"Birak","Bunuru"|
|Between Bunuru and Djeran|pMonth = 3, pMonth = 4|"Bunuru","Djeran"|
|Between Djeran and Makuru|pMonth = 5, pMonth = 6|"Djeran","Makuru"|
|Between Makuru and Dijiba|pMonth = 7, pMonth = 8|"Makuru","Dijiba"|
|Between Dijiba and Kambarang|pMonth = 9, pMonth = 10|"Dijiba","Kambarang"|
|Between Kambarang and Birak|pMonth = 11, pMonth = 12|"Kambarang","Birak"|

**malaysiaAndSriLanka submodule** 
|Boundary| Test Data| Expected Result| 
|:-|:-|:-|
|Between Northeast Monsoon and Inter-monsoon|pMonth = 2, pMonth = 3|"Northeast Monsoon","Inter-monsoon"|
|Between Inter-monsoon and Southeast-monsoon|pMonth = 4, pMonth = 5|"Inter-monsoon","Southeast-monsoon"|
|Between Southeast-monsoon and Inter-monsoon|pMonth = 9, pMonth = 10|"Southeast-monsoon","Inter-monsoon"|
|Between Inter-monsoon and Northeast Monsoon|pMonth = 11, pMonth = 12|"Inter-monsoon","Northeast Monsoon"|

**perthMorning submodule** 
|Boundary| Test Data| Expected Result| 
|:-|:-|:-|
|Between below 18.2 by more than 5 / below 18.2 by less than 5 |13.1999, 13.2|BELOW MORE THAN 5, BELOW LESS THAN 5
|Between below 18.2 by less than 5 / equal to 18.2|18.1999, 18.2|BELOW LESS THAN 5, EQUAL AVERAGE
|Between equal to 18.2 / above 18.2 by less than 5|18.2, 18.2001|EQUAL AVERAGE, ABOVE LESS THAN 5
|Between above 18.2 by less than 5 / above 18.2 by more than 5|23.2, 23.2001| ABOVE LESS THAN 5, ABOVE MORE THAN 5

**perthAfternoon submodule** 
|Boundary| Test Data| Expected Result| 
|:-|:-|:-|
|Between below 23.0 by more than 5 / below 23.0 by less than 5|17.9999,18.0|BELOW MORE THAN 5, BELOW LESS THAN 5
|Between below 23.0 by less than 5 / equal to 23.0|22.9999, 23.0|BELOW LESS THAN 5, EQUAL AVERAGE
|Between equal to 23.0 / above 23.0 by less than 5 |23.0, 23.0001|EQUAL AVERAGE, ABOVE LESS THAN 5
|Between above 23.0 by less than 5 / above 23.0 by more than 5 |28.0, 28.0001|ABOVE LESS THAN 5, ABOVE MORE THAN 5

LAST FOUR DIGITS, LAST NAME ON ID, NAME OF COUNTRY WISH TO VISIT

## **5. Test Designs (White Box Testing)**  
For white box testing I have assumed that the code paths can be accessed through multiple submodules. For example, if a submodule calls to different submodules within the program, those paths will be explored and tested in terms of the white box approach. I have also assumed that the test data was inserted through the acts of the user inputting the data before it reaches the specific submodule. 

The white box test design has been performed by testing two simple submodules, and then one larger submodule that calls in other submodules. This has been done to show how the paths are taken within the program, and testing these paths with the white box approach ensures that the correct information is being printed to the screen. I have chosen the countrySeason submodule as it is the submodule that calls to different submodules the most.  
***

**spainAndJapan submodule** 
|Path| Test Data| Expected Result|
|:-|:-|:-|
|Enters First Case|Input : "12" |Output : "Winter"
|Enters Second Case|Input : "3" |Output : "Spring"
|Enters Third Case|Input : "6"|Output : "Summer:
|Enters Last Case|Input : "9" |Output : "Autumn"

**perthMorning submodule** 
|Path| Test Data| Expected Result|
|:-|:-|:-|
|Enter First IF|Input : "18.0"|Output : "18.0 is below the average temperature of 18.2"
|Enter First IF, Then Second IF|Input : "10.0" |Output : "10.0 is below the average temperature of 18.2\n10.0 is below the average temperature of 18.2 by more than 5 degrees celsius"
|Enters Else If|Input : "19.0" |Output : "19.0 is above the average temperature of 18.2"
|Enters Else If, Then IF|Input : "30.0" |Output : "30.0 is above the average temperature of 18.2\n30.0 is above the average temperature of 18.2 by more than 5 degrees celsius"
|Enters Else|Input : "18.2" |Output : "18.2 is the same as the average temperature of 18.2"

**countrySeason submodule** 
|Path| Test Data| Expected Result|
|:-|:-|:-|
|Enter australiaMeteorological case, THEN Enter "Summer" case|Input : "1\n1"|Output: "Summer"
|Enter australiaMeteorological case, THEN Enter "Autumn" case|Input : "1\n4"|Output: "Autumn"
|Enter australiaMeteorological case, THEN Enter "Winter" case|Input : "1\n7"|Output: "Winter"
|Enter australiaMeteorological case, THEN Enter "Spring" case|Input : "1\n10"|Output: "Spring"
|Enter australiaMeteorological case, THEN Enter "error" case|Input : "1\n13"|Output: "error"
|Enter australiaNoongar case, THEN Enter "Birak" case|Input : "2\n1"|Output: "Birak"
|Enter australiaNoongar case, THEN Enter "Bunuru" case|Input : "2\n3"|Output: ""Bunuru"
|Enter australiaNoongar case, THEN Enter "Djeran" case|Input : "2\n5"|Output: "Djeran"
|Enter australiaNoongar case, THEN Enter "Makuru" case|Input : "2\n7"|Output: "Makuru"
|Enter australiaNoongar case, THEN Enter "Dijiba" case|Input : "2\n9"|Output: "Dijiba"
|Enter australiaNoongar case, THEN Enter "Kambarang" case|Input : "2\n11"|Output: "Kambarang"
|Enter australiaNoongar case, THEN Enter "error" case|Input : "2\n14"|Output: "error"
|Enter spainAndJapan case, THEN Enter "Winter" case|Input : "4\n12"|Output: "Winter"
|Enter spainAndJapan case, THEN Enter "Spring" case|Input : "4\n4"|Output: "Spring"
|Enter spainAndJapan case, THEN Enter "Summer" case|Input : "4\n7"|Output: "Summer"
|Enter spainAndJapan case, THEN Enter "Autumn" case|Input : "4\n10"|Output: "Autumn"
|Enter spainAndJapan case, THEN Enter "error" case|Input : "4\n14"|Output: "error"
|Enter mauritius case, THEN Enter "Summer" case|Input : "5\n1"|Output: "Summer"
|Enter mauritius case, THEN Enter "Autumn" case|Input : "5\n5"|Output: "Autumn"
|Enter mauritius case, THEN Enter "Winter" case|Input : "5\n8"|Output: "Winter"
|Enter mauritius case, THEN Enter "Spring" case|Input : "5\n10"|Output: "Spring"
|Enter mauritius case, THEN Enter "error" case|Input : "5\n20"|Output: "error"
|Enter malaysiaAndSriLanka case, THEN Enter "Northeast Monsoon" case|Input : "7\n1"|Output:"Northeast Monsoon"
|Enter malaysiaAndSriLanka case, THEN Enter "Inter-monsoon" case|Input : "7\n4"|Output:"Inter-monsoon"
|Enter malaysiaAndSriLanka case, THEN Enter "Southeast-monsoon" case|Input : "7\n8"|Output:"Southeast-monsoon"
|Enter malaysiaAndSriLanka case, THEN Enter "Inter-monsoon" case|Input : "7\n11"|Output:"Inter-monsoon"
|Enter malaysiaAndSriLanka case, THEN Enter "error" case|Input : "7\n0"|Output:"error"


## **6. Test Implementation**  
To run the test code with the correct commands, make sure to be in the correct directory, then follow below:  
(You must compile the program first before running with -ea.)  
ea : "enable assertions"  
(The runs below show the success of the final test suite programs,)
***
**Equivalence Part**  
![Equivalence Part](ep.png)  
**Boundary Value Analysis**  
![Boundary Value Analysis](bva.png)  
**White Box Test**  
![White Box Test](wbt.png)  
***
The first failure to appear was that for scenario 1, the country/season submodules could not return an "error" string. I realised that the error was being printed straight to the terminal and was not actually stored in a variable to be able to be returned. Thus, changes have been made so that the "error" string was stored in the variable, allowing for it to be returned for testing. Without this error, we would assume that there would be no case of an error for these country/season submodules. Testing has allowed me to realise all of the test cases and what was missing. Therefore, for all of the country/season submodules, a new default case statement was added to act as error handling for any values that were invalid.
***
**Assertion Error : not returning the "error" string**  
![Equivalence Part](epfail.png)  
**Fix To Handle Error Strings**  
![Default Statement : Error](errorfix.png)  
***
### **Table Of Modules**
|Module Name| BB test design(EP)| BB test design(BVA)|WB test design|EP test code (implemented/run)|BVA test code (implemented/run)|White-Box testing (implemented/run)|
|:-|:-|:-|:-|:-|:-|:-|
|choosingCountry|/|/|/|/|/|/|
|choosingMonth|/|/|/|/|/|/|
|countrySeason|/|/|done|/|/|done|
|australiaMeteorological|done|done|/|done|done|/|
|australiaNoongar|done|done|/|done|done|/|
|spainAndJapan|done|/|done|done|/|done|
|mauritius|done|/|/|done|/|/|
|malaysiaAndSriLanka|done|done|/|done|done|/|
|averageTemp|/|/|/|/|/|/|
|choosingTemp|/|/|/|/|/|/|
|perthMorning|done|done|done|done|done|done|
|perthAfternoon|done|done|/|done|done|/|
|adelaideMorning|done|/|/|done|/|/|
|adelaideAfternoon|done|/|/|done|/|/|
|displayImage|/|/|/|/|/|/|  
## **7. Version Control** 
Version control has been applied since the start of this software project. A local git repository was made and changes have been committed throughout the process. The different branches include main, Temperature, Modulation, Images and Country/Seasons. Each branch solves an implementation of the program and once the implementation was a success it would fully merge back into the original branch (main). Commits have also been made for this report along the way, every time a certain section was complete a commit would happen. The test suite programs did not take much time to create, so once a test suite program was complete, a commit would be made. When there were no more assertion errors from the test suites, a final commit was made to the main branch. Any new revisions or additions would also be committed when the program was functioning properly again.
***
## **From Earliest to Latest**  
![1](1.png)  
![2](2.png) 
![3](3.png) 
![4](4.png) 
![5](5.png) 


## **8. Ethics and Professionalism** 
A scenario involves the program being part of a larger software project involving holiday destinations and hotel booking. This larger software project will utilise the program by providing an analysis depending on the users choices. When the user makes a booking for a holiday in either Australia, Spain, Japan, Mauritius, Malaysia or Sri Lanka, an analysis will be performed depending on the chosen date. With this chosen date, the program is able to calculate the season of the specific country depending on the month chosen.

Another utility the program offers for the larger software project is analysing average temperatures in Perth and Adelaide. The user may be able to input a temperature that they desire for their particular holiday. The program allows an analysis to be performed notifying if their chosen temperature is above or below the average temperature of these cities. In addition, it also notifies if the chosen temperature is above or below the average temperature by more than five degrees celsius. This proves beneficial, as users are able to make a more educated guess on whether to have a holiday in Perth or Adelaide based on their desired temperature for a holiday. Additionally, when the program notifies that the desired temperature is above or below the average temperature by more than five degrees celsius, it gives the user more insight on whether to really choose the city as a holiday destination.
 
Lack of ethics and professionalism can result in harmful effects from a software project. From the program, the most harm it can provide is if a user is accidentally misguided. Now it depends on how catastrophic the misguidedness becomes. If a user uses the program and realises they did not like the season in a specific country or deemed it was too cold or too hot for a holiday, only their feelings are harmed. But, say for example a pilot was using the program to determine if there were storms ahead based on the season of the country they were about to fly over. If they were misinformed by the program that it was safe but it was actually not safe, lives could potentially be in danger. It all depends on the situation and which software projects the program should really be implemented into judging by the simplicity.

In terms of the good life for others, the program offers analysis based on the options chosen by the user. It contributes to good life as it provides an analysis, and successfully delivers the knowledge to the user. A lack of ethics and professionalism may lead to misinformation to the user, or just an incorrect analysis overall. A lack of professionalism in a program leads to harm, as the program performs something that it shouldn't do. It doesn't hold its main purpose and therefore leads to misinformation being spread.

The program is obligated to protect the public, in terms of the public it refers to whoever uses the program. It is in the program's best interest to provide the correct information to the user, that is the way it protects the public. The program aims to protect the public by preventing incorrect results from being shown by the program. Specifically, this includes always showing the correct season when a given country and month is provided. In addition, also making sure that the correct analysis is performed when a given temperature and a chosen temperature average of a city/time is given. By always providing correct results, the public is protected from misinformation which could potentially harm depending on the situation.

The main goal of the program is to provide assistive technology for the user. This provides a positive impact to the world, and having a lack of ethics and professionalism within the program could reduce this positive impact. A big topic is how software engineers actually live up to these ethical standards and professionalism. Self reflection is important, having a lack in this ethical standard leads to programs not performing at its full potential. Self reflecting on one's coding skills and knowledge of the issue is important in creating an efficient program. A lack of self reflection leads to the program being built blindly which causes more harm than good.

The first suggestion to avoid ethical and professional issues in the software is from the IEEE-CS code of ethics. Principle three mentions, "software engineers shall ensure that their products and related modifications meet the highest professional standards possible". From the scope of this assignment, this avoids ethical and professional issues as this guideline ensures that the final program is up to standard. It ensures that the program is not under-developed as well as not being over-developed that the code is out of scope. This guideline helps to prevent professionalism issues. For example, scenarios have been provided and once these scenarios have been solved through building a program, that's when we can consider that the program has met the highest professional standard.

The second suggestion to avoid ethical and professional issues in the software is from the ACS code of ethics. Code three mentions "Honesty", which relates to an honest representation of one's skills, knowledge, services and products. This code helps to reduce the previously mentioned issues by making sure that whoever is creating the program fully understands what needs to be achieved. They need to have the skills to code, knowledge about the different countries and seasons. In addition, also knowing how to problem solve to be able to provide an analysis on a given temperature reading compared to a city's average temperature. Being honest in the final representation of the product is also important. Being dishonest will lead to ethical and professional issues as the scope of the issue is not fully understood. Dishonesty in a product or program leads to an under-developed product. An under-developed product or program that does not fully understand the full scope of the issue will lead to more harm than good. That is why code three of the ACS code of ethics, which talks about "honesty", helps to avoid ethical and professional issues within a software project.

## **9. Discussion** 
There are many different approaches that could have been taken for this assignment. An approach that I would like to try is by separating both scenarios into their own programs/java files. This would make it so I can individually test each scenario with more robustness. Another approach is maybe by having a different type of navigation for the menu. Allowing the user to also input strings as their choice may also be another good way of testing the program.

From the work presented I feel it has done an efficient job in separating the tasks of the whole program. This makes the code of the program much more easier to read, thus making testing easier since we know what is really being tested. Using integers as navigation for choices makes it an easy way to really test the program's outputs and what to expect. Even during the testing process, failures in the program were found and fixed. These issues of modularity or testing provided insight of what lacked within the program. This allowed for specific changes of improvement to be made, making the final program very robust.

I would improve my work by spending more time thinking about how the program could be coded. By taking the time to think and prepare, I would have been able to set up the program in a way that testing would be more versatile. Versatile in the way that it can test file inputs, file outputs and keyboard inputs. This would make the testing process more rigorous and that's something that the project could improve on. Another improvement would be the white box testing for scenario two. Being able to have a white box test approach towards scenario two would allow us to explore the different paths of outputs that could occur, which was unable to be demonstrated in this project.  