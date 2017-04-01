# Sogeti Digital Bootcamp - Jenkins 2

In this bootcamp we will show you the basics on how to use Jenkins 2 as an automation tool. 
The bootcamp cosnsists of 5 steps for the basics and 1 advanced usage sample. 
Each of the 5 steps represent steps in your automation process and will either be an action to take (job) or automation of those tasks (pipeline). 
The advanced usage sample will teach you how to use DSL to parameterize your jobs and pipelines for easy re-use 

# Table of Contents
- [Installation](#Jenkins-installation)
- [Configuration](#Jenkins-Configuration)
- [Step 1 - Create Checkout Job](#step-1---create-checkout-job)
- [Step 2 - Create Compile Job](#step-2---create-compile-job)
- [Step 3 - Create Unit Test Job](#step-3---create-unit-test-job)
- [Step 4 - Create Deployment Job](#step-4---create-deployment-job)
- [Step 5 - Create pipeline with all jobs](#step-5---create-pipeline-with-all-jobs)
- [Step 6 - Advanced Usage (DSL)](#step-6---advanced-usage-dsl)

# Jenkins installation

[../Back to ToC](#Table-of-Contents)

For installation instruction including images (Windows) click [here](/docs/Install.md)

Jenkins Can be downloaded from [Jenkins.io](http://www.Jenkins.io)

install instructions

- Follow the install wizard
- [Configure Jenkins](#Jenkins-Configuration)

Additionally for this bootcamp you will need Git and Java SDK. If you do not have these find the downloads below. 
Instructions with screens are added in the [Detailed instrcutions](/docs/Install.md)

- Git can be downloaded [here](https://git-scm.com/download/win)
- Java SDK can be downloaded [here](http://www.oracle.com/technetwork/java/javase/downloads/index.html)

#Jenkins Configuration

[../Back to ToC](#Table-of-Contents)

For configuration instruction including images (Windows) click [here](/docs/Config.md)

When the wizard completes Jenkins will 

# AANVULLEN!

Additional configuration

Git:

Java:

Maven:

# Step 1 - Create Checkout Job

[../Back to ToC](#Table-of-Contents)

For detailed instruction including images click [here](/docs/Step1.md)

One of the first tasks in our automation process is to retrieve the code from version control to be used in the automation process. To do this we want to approach the Git Repository and checkout the code.

- Go to the Jenkins Dashboard (http://localhost:8080/)
- Go to "New item". Enter “Code Checkout” as the item name and choose "Freestyle project"
- Go to "Source code management" and select "Git". 
- Enter https://github.com/jeroenschepens/bootcamp-jenkins-example.git in the field "Repository URL".
- Click on "Save".

# willen we hier nog iets doen met verschillende branches? e.g. een foute branch laten invullen zodat hij failed?

Now we want to test our job. so we start it manually.

- After saving click on the "Back to Dashboard" option to go back to the Jenkins Dashboard.
- Scroll down to find the created jobs.
- Click on "Schedule a build" icon all the way to the right to mark this job for execution
- Look at the icon on the left for the status. We see that it is Blue which indicates a successful execution.
- If you are interested in the details of the job execution you can click on the "#1" (or any other number) to see the details.



# Step 2 - Create Compile Job

[../Back to ToC](#Table-of-Contents)

For detailed instruction including images click [here](/docs/Step2.md)

Now that the code can be found on the git repository we can see if the code will compile / build and see if there are no syntax errors of any kind.

- Go back to your Jenkins Dashboard if not already there.
- Go to "New item". Enter “Compile Code” as the item name and choose "Freestyle project"
- Go to "Source code management" and select "Git". Enter https://github.com/jeroenschepens/bootcamp-jenkins-example.git in the field "Repository URL".
- Go to "Build" and select "ADD BUILD STEP". Choose "Invoke top-level Maven targets". Select "M3" in the "Maven Version" dropdown menu.
- Enter "clean compile" in the "Goals" field.
- Click on "Save".

Again we have to run this job. We can go back to the Jenkins Dashboard and schedule it immediately or we can click the "Build Now" Option after saving the previous steps.
Please have a look at the results.. and see if anything went wrong.


We can see that instead of the blue icon we have a red icon. Something went wrong in executing this job. Open the details to find out why the job did not succeed. Click "Console Output for actual build info"
Note: The first time running this job may need addition libraries for maven. This can clog the console output with download info. 
Actual output can be found on the bottom. Alternatively you can re-run the build and see the Console output directly.

Can you find out what went wrong with the code and why it did not build? Go and edit the code and re-run the job until it completes.

Alternatively you can change the branch in the job in the "Source Code management" tab to "*/step2".
Re-run the job and take a look at the outcome.
# retest after pull request.

Note on the jenkins Dashboard: 
Note that we can also have a Weather icon in the Jenkins Dashboard. This indicates how the past couple of runs have been executed. 
Sunny weather means nothing went wrong. 
Cloudy weather means some executions were unsuccessful. 
Thunderstorms means most of the past runs were unsuccessful.
# Note for team!!!!! can someone confirm what i wrote on the weather???


# Step 3 - Create Unit Test Job

[../Back to ToC](#Table-of-Contents)

For detailed instruction including images click [here](/docs/Step3.md)

Now that our code compiles we would like to run some tests. For Maven we can request to perform a standard set of Unit tests. Other languages might have a different implementation

- Go back to your Jenkins Dashboard if not already there.
- Go to "New item". Enter “Test” as the item name and choose "Freestyle project"
- Go to "Source code management" and select "Git". Enter https://github.com/jeroenschepens/bootcamp-jenkins-example.git in the field "Repository URL".
- Go to "Build" and select "ADD BUILD STEP". Choose "Invoke top-level Maven targets". Select "M3" in the "Maven Version" dropdown menu.
- Enter "clean test" in the "Goals" field.
- Click on "Save".

# Step 4 - Create Deployment Job

[../Back to ToC](#Table-of-Contents)

For detailed instruction including images click [here](/docs/Step4.md)

Since we can't actually deploy our test application we have chosen to simulate this step by creating a notification step instead.

# Step 5 - Create pipeline with all jobs

[../Back to ToC](#Table-of-Contents)

For detailed instruction including images click [here](/docs/Step5.md)

No Content Yet

# Step 6 - Advanced Usage (DSL)

[../Back to ToC](#Table-of-Contents)

For detailed instruction including images click [here](/docs/Step6.md)

No Content Yet.