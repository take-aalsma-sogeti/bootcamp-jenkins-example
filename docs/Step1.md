click [here](../README.md) to go back to the main README. 

# Step 1 - Create Checkout Job


# Table of Contents
- [Create Checkout Job](#create-checkout-job)
- [Run Checkout Job](#run-checkout-job)

## create checkout job

One of the first tasks in our automation process is to retrieve the code from version control to be used in the automation process. To do this we want to approach the Git Repository and checkout the code.

Go to the Jenkins Dashboard (http://localhost:8080/)
Go to "New item". 


![alt text](/docs/images/Step1/Step1-1.png "Logo Title Text 1")

Enter “Code Checkout” as the item name and choose "Freestyle project"

![alt text](/docs/images/Step1/Step1-2.png "Logo Title Text 1")

Go to "Source code management" and select "Git". 

![alt text](/docs/images/Step1/Step1-3.png "Logo Title Text 1")

Enter https://github.com/__username__/bootcamp-jenkins-example.git in the field "Repository URL".

Check that Branch specifies "*/Master"

Click on "Save".

***

## Run Checkout job

Now we want to test our job. so we start it manually.

After saving click on the "Back to Dashboard" option to go back to the Jenkins Dashboard.

![alt text](/docs/images/Step1/Step1-4.png "Logo Title Text 1")

Scroll down to find the created jobs.


Click on "Schedule a build" icon all the way to the right to mark this job for execution

![alt text](/docs/images/Step1/Step1-5.png "Logo Title Text 1")

Look at the icon on the left for the status. We see that it is Blue which indicates a successful execution.

![alt text](/docs/images/Step1/Step1-6.png "Logo Title Text 1")

If you are interested in the details of the job execution you can click on the "#1" (or any other number) to open the specific job execution.


