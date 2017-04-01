click [here](../README.md) to go back to the main README. 

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



![alt text](https://github.com/adam-p/markdown-here/raw/master/src/common/images/icon48.png "Logo Title Text 1")

![alt text](https://onedrive.live.com/embed?cid=DF79265212273E99&resid=DF79265212273E99%21104394&authkey=AGIjarCizK0KWuI "Logo Title Text 1")
