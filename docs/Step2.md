click [here](../README.md) to go back to the main README. 

# Step 2 - Create Compile Job

# Table of Contents
- [Create compile Job](#create-checkout-job)
- [Run compile Job](#run-checkout-job)
- [fix syntax](#fix-syntax)
  - [alternative path](#alternative-path)
- [weather Icon](#weather-icon)


## create compile job

Now that the code can be found on the git repository we can see if the code will compile / build and see if there are no syntax errors of any kind.

Go back to your Jenkins Dashboard if not already there.

Go to "New item". 

![alt text](/docs/images/Step2/Step2-1.png "Logo Title Text 1")

Enter “Compile Code” as the item name and choose "Freestyle project"

![alt text](/docs/images/Step2/Step2-2.png "Logo Title Text 1")

Go to "Source Code Management"

Enter https://github.com/__username__/bootcamp-jenkins-example.git in the field "Repository URL".
Make sure you use your own username


![alt text](/docs/images/Step2/Step2-3.png "Logo Title Text 1")

Go to "Build" and select "ADD BUILD STEP". Choose "Invoke top-level Maven targets". 

![alt text](/docs/images/Step2/Step2-4.png "Logo Title Text 1")

Select "M3" in the "Maven Version" dropdown menu.

Enter "clean compile" in the "Goals" field.

Click on "Save".

***

## Run compile job

Again we have to run this job. We can go back to the Jenkins Dashboard and schedule it immediately 
or we can click the "Build Now" Option after saving the previous steps.



Please have a look at the results.. and see if anything went wrong.

## Fix Syntax

![alt text](/docs/images/Step2/Step2-5.png "Logo Title Text 1")

We can see that instead of the blue icon we have a red icon. 
Something went wrong in executing this job. 
Open the details to find out why the job did not succeed. 

![alt text](/docs/images/Step2/Step2-6.png "Logo Title Text 1")

Click "Console Output for actual build info"
Note: The first time running this job may need addition libraries for maven. This can clog the console output with download info. 
Actual output can be found on the bottom. Alternatively you can re-run the build and see the Console output directly.

![alt text](/docs/images/Step2/Step2-7.png "Logo Title Text 1")

Can you find out what went wrong with the code and why it did not build? 
Go and edit the code and re-run the job until it completes.

Note: 
In order for jenkins to register your new code you need to edit the file locally, commit the changes and push them to your repository. 
Ask help from one of the instructors if you need
If you can't wait for help or can't figure out what went wrong you can follow the alternative Path

### Alternative Path


Alternatively you can change the branch in the job to one where we fixed the code for you

![alt text](/docs/images/Step2/Step2-alt-1.png "Logo Title Text 1")

to get there from the Dashboard click on the job name

![alt text](/docs/images/Step2/Step2-alt-2.png "Logo Title Text 1")

click configure

![alt text](/docs/images/Step2/Step2-alt-3.png "Logo Title Text 1")

in the "Source Code management" tab to "*/step2".

Re-run the job and take a look at the outcome.

## Weather Icon

Note on the jenkins Dashboard: 

Note that we can also see a Weather icon in the Jenkins Dashboard. This indicates how the past couple of runs have been executed. 
Sunny weather means nothing went wrong. 
Cloudy weather means some executions were unsuccessful. 
Thunderstorms means most of the past runs were unsuccessful.










