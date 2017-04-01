# Global

In this bootcamp we will show you the basics on how to use Jenkins 2 as an automation tool. 
The bootcamp cosnsists of 5 steps for the basics and 1 advanced usage sample. 
Each of the 5 steps represent steps in your automation process and will either be an action to take (job) or automation of those tasks (pipeline). 
The advanced usage sample will teach you how to use DSL to parameterize your jobs and pipelines for easy re-use 

These are the steps:

- Step 1 - Create Checkout Job
- Step 2 - Create Compile Job
- Step 3 - Create Unit Test Job
- Step 4 - Create Deployment Job
- Step 5 - Create pipeline with all jobs
- Step 6 - Advanced Usage (DSL)

# Step 1 - Create Checkout Job

One of the first tasks in our automation process is to retrieve the code from version control to be used in the automation process. To do this we want to approach the Git Repository and checkout the code.

- Go to "New item". Enter “Test” as the item name and choose "Freestyle project"
- Go to "Source code management" and select "Git". Enter https://github.com/jeroenschepens/bootcamp-jenkins-example.git in the field "Repository URL".
- Click on "Save".

Now we want to test our job. so we start it manually.

Please have a look at the results.. and see if anything went wrong.
# Step 2 - Create Compile Job
- Go to "New item". Enter “Compile” as the item name and choose "Freestyle project"
- Go to "Source code management" and select "Git". Enter https://github.com/jeroenschepens/bootcamp-jenkins-example.git in the field "Repository URL".
- Go to "Build" and select "ADD BUILD STEP". Choose "Invoke top-level Maven targets". Select "M3" in the "Maven Version" dropdown menu.
- Enter "clean compile" in the "Goals" field.
- Click on "Save".
# Step 3 - Create Unit Test Job
- Go to "New item". Enter “Test” as the item name and choose "Freestyle project"
- Go to "Source code management" and select "Git". Enter https://github.com/jeroenschepens/bootcamp-jenkins-example.git in the field "Repository URL".
- Go to "Build" and select "ADD BUILD STEP". Choose "Invoke top-level Maven targets". Select "M3" in the "Maven Version" dropdown menu.
- Enter "clean test" in the "Goals" field.
- Click on "Save".

# Step 4 - Create Deployment Job

Since we can't actually deploy our test application we have chosen to simulate this step by creating a notification step instead.

# Step 5 - Create pipeline with all jobs

No Content Yet

# Step 6 - Advanced Usage (DSL)

No Content Yet.