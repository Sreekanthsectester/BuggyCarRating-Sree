# Test Directions for "Buggy Car Rating" Application

## **About the project** 
This project includes manual and automation testing of Buggy Car Rating application https://buggy.justtestit.org/. Instruction to run the fucntional automation test suite uisng selenium and non-functional testing using Jmeter tool.

## Test Artificates for Manual Testing:

1. Test Approach is provided
      https://github.com/Sreekanthsectester/BuggyCarRating/blob/main/Test%20Approach.pdf
   
2. Defect report is provided
      https://github.com/Sreekanthsectester/BuggyCarRating/blob/main/Defect%20Report.pdf
   
## Automation Testing Guidlines :

## Functional Test Automation using Selenium Webdriver+Java

**Structure for the project**

/src/

   ![image](https://user-images.githubusercontent.com/43629533/168997606-2c7cddce-7c96-4ae9-b32b-6c4b76a64db8.png)

Under src folder, the project includes main and test folders.

WebDriver Manager has been set up using the Maven, which provides a cross-browser API that can be used to most of the drive web browsers (e.g., Chrome, Edge, or Firefox, among others).

## **Instruction to run Automation TestSuite** :

**Pre-Requisites :** 

  1. Install Java version 1.8 or latest, check for the version in command prompt : "java -version". 


       ![image](https://user-images.githubusercontent.com/43629533/168983506-134fe32c-f724-4642-9652-6fef54b3ac2a.png)

  2. Download Maven from https://maven.apache.org/download.cgi , set-up the system environment varaibles accordingly , Check for the Maven on command propmt : "mvn -            version".


       ![image](https://user-images.githubusercontent.com/43629533/168984938-99015864-9531-429c-9666-d5c3948cfee3.png)

  3. Download and install Eclipse IDE : https://www.eclipse.org/downloads/

## **How to download and build the project** :

  1. Clone the repo from https://github.com/Sreekanthsectester/BuggyCarRating

  2. Extract the "buggyCarRatingApplication" project repo into your workspace, and import the project in Eclipse IDE and do a "maven update"


      ![image](https://user-images.githubusercontent.com/43629533/168986090-1eb720f3-3e2b-459b-a2c7-d70ad3d7c98f.png)

  3. After importing the project "buggyCarRatingApplication". Go to the "config.properties" File and update the new user detailed to be registered for Buggy Car Rating      Apllication as required.


      ![Configfile1](https://user-images.githubusercontent.com/43629533/169006153-4610cf7b-19c5-459f-a47b-f74477d8379f.png)



## **How to run the project using TestNG** :

  4. Make sure to "Save All" files. Run all the Test Cases using TestNG 


     ![image](https://user-images.githubusercontent.com/43629533/168992013-42c45e0b-9a5d-4a62-9ae6-92cf0c90c062.png)

## **View the Project Test Summary Report** :

  5. To view the emailable reports, as show below


     ![image](https://user-images.githubusercontent.com/43629533/168992645-5d7a4630-1dc9-4d43-8305-be182a97e06b.png)


## Perfomance Testing using Jmeter - Load Test

1.Check Java is installed:
    
    ![image](https://user-images.githubusercontent.com/43629533/169022766-da118a67-632e-4df5-af02-4918748c0f02.PNG)

 
2.Download and Install Jmeter from https://jmeter.apache.org/download_jmeter.cgi  and extract the folder

3. Run Jmeter.bat file under \Bin folder

     ![image](https://user-images.githubusercontent.com/43629533/169015037-da6ca4d7-11a9-44f9-9b5c-64d511c930b0.png)
     
4. Rename the Test plan to BuggyCarRating
5. Add a Thread Group 
     
     ![image](https://user-images.githubusercontent.com/43629533/169019193-8875d24b-4387-4e4c-b9b1-1ec83d958219.png)
     

        
6. Enter 100 at "Number of Threads(users), 12 at Rampup-up period(second) and 1 at Loop count
   
   Note : Number can vary based on requirement

     ![image](https://user-images.githubusercontent.com/43629533/169019720-c57de4f8-1105-49ac-a4a4-995870050828.png)
     
7. Add a HTTP Request

      ![image](https://user-images.githubusercontent.com/43629533/169020043-eb430068-98d2-4b0e-9514-8c9cd742d417.png)
      ![image](https://user-images.githubusercontent.com/43629533/169023406-cd197938-d835-4ce5-bfd8-e19d03b0b3fe.png)

8. Enter Server Name or IP as buggy.justtestit.org  and Path as / 

      ![image](https://user-images.githubusercontent.com/43629533/169020685-d66b2bdd-8c97-4b64-a274-6df892e48489.png)
      ![image](https://user-images.githubusercontent.com/43629533/169020860-7e21904b-b1bf-4f21-9cd9-bf274f076bcc.png)
      

9. Save It .JMX file

      ![image](https://user-images.githubusercontent.com/43629533/169021505-7a89f90c-c735-4064-8195-fb92fda802d3.png) 
      
10. Click on Green play button to run the test 

      ![image](https://user-images.githubusercontent.com/43629533/169021095-628e4019-f168-42a3-8846-b71ac3251da2.png)
      
11. Result will be shown when click on View Results Tree and View Results in Table as following : 

      ![image](https://user-images.githubusercontent.com/43629533/169021777-daf4b5eb-d5b4-455c-89f1-43cd83448eb6.png)
      ![image](https://user-images.githubusercontent.com/43629533/169021867-bc66b844-9a09-4429-bd38-80827c23e8f1.png)


                                                          The END**
      
      



 



                                

