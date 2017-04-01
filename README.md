# Global

In this bootcamp we will show you the basics on how to use Jenkins 2 as an automation tool. 
The bootcamp cosnsists of 5 steps for the basics and 1 advanced usage sample. 
Each of the 5 steps represent steps in your automation process and will either be an action to take (job) or automation of those tasks (pipeline). 
The advanced usage sample will teach you how to use DSL to parameterize your jobs and pipelines for easy re-use 

These are the steps:

- [Step 1 - Create Checkout Job](#step-1---create-checkout-job)
- Step 2 - Create Compile Job
- Step 3 - Create Unit Test Job
- Step 4 - Create Deployment Job
- Step 5 - Create pipeline with all jobs
- Step 6 - Advanced Usage (DSL)

For installation instruction including images (Windows) click [here](/docs/Install.md)

For configuration instruction including images (Windows) click [here](/docs/Config.md)

# Step 1 - Create Checkout Job

For detailed instruction including images click [here](/docs/Step1.md)

One of the first tasks in our automation process is to retrieve the code from version control to be used in the automation process. To do this we want to approach the Git Repository and checkout the code.

- Go to the Jenkins Dashboard (http://localhost:8080/)
- Go to "New item". Enter “Code Checkout” as the item name and choose "Freestyle project"
- Go to "Source code management" and select "Git". 
- Enter https://github.com/jeroenschepens/bootcamp-jenkins-example.git in the field "Repository URL".
- Click on "Save".

Now we want to test our job. so we start it manually.

- After saving click on the "Back to Dashboard" option to go back to the Jenkins Dashboard.
- Scroll down to find the created jobs.
- Click on "Schedule a build" icon all the way to the right to mark this job for execution
- Look at the icon on the left for the status. We see that it is Blue which indicates a successful execution.
- If you are interested in the details of the job execution you can click on the "#1" (or any other number) to see the details.



# Step 2 - Create Compile Job

For detailed instruction including images click [here](/docs/Step2.md)

- Go back to your Jenkins Dashboard if not already there.
- Go to "New item". Enter “Compile Code” as the item name and choose "Freestyle project"
- Go to "Source code management" and select "Git". Enter https://github.com/jeroenschepens/bootcamp-jenkins-example.git in the field "Repository URL".
- Go to "Build" and select "ADD BUILD STEP". Choose "Invoke top-level Maven targets". Select "M3" in the "Maven Version" dropdown menu.
- Enter "clean compile" in the "Goals" field.
- Click on "Save".

Again we have to run this job. We can go back to the Jenkins Dashboard and schedule it immediately or we can click the "Build Now" Option after saving the previous steps.
Please have a look at the results.. and see if anything went wrong.


We can see that instead of the blue icon we have a red icon. Something went wrong in executing this job. Open the details to find out why the job did not succeed.


Note that we can also have a Weather icon in the Jenkins Dashboard. This indicates how the past couple of runs have been executed. 
Sunny weather means nothing went wrong. 
Cloudy weather means some executions were unsuccessful. 
Thunderstorms means most of the past runs were unsuccessful.
# Note for team!!!!! can someone confirm what i wrote on the weather???


# Step 3 - Create Unit Test Job

For detailed instruction including images click [here](/docs/Step3.md)

- Go to "New item". Enter “Test” as the item name and choose "Freestyle project"
- Go to "Source code management" and select "Git". Enter https://github.com/jeroenschepens/bootcamp-jenkins-example.git in the field "Repository URL".
- Go to "Build" and select "ADD BUILD STEP". Choose "Invoke top-level Maven targets". Select "M3" in the "Maven Version" dropdown menu.
- Enter "clean test" in the "Goals" field.
- Click on "Save".

# Step 4 - Create Deployment Job

For detailed instruction including images click [here](/docs/Step4.md)

Since we can't actually deploy our test application we have chosen to simulate this step by creating a notification step instead.

# Step 5 - Create pipeline with all jobs

For detailed instruction including images click [here](/docs/Step5.md)

No Content Yet

# Step 6 - Advanced Usage (DSL)

For detailed instruction including images click [here](/docs/Step6.md)

No Content Yet.