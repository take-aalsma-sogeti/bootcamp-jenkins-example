click [here](../README.md) to go back to the main README. 

# Step 4 - Create Deployment Job

# Table of Contents
- [create Deployment job](#create-deployment-job)
- [Run Deployment Job](#run-deployment-job)
- [Configure mail](#configure-mail)
    - [Gmail Two Factor Authentication](#two--factor-authentication)
- [Re-run Job](#rerun-job)

***

## create Deployment job

Since we can't actually deploy our test application we have chosen to simulate this step by creating a notification step instead.

Go back to your Jenkins Dashboard if not already there.

Go to "New item". Enter “Deploy” as the item name and choose "Freestyle project"

![alt text](/docs/images/Step4/Step4-1.png "Logo Title Text 1")

Ok so below steps are some you have done in the previous three steps so i'll save you the extra images and repeat the steps which we have done before:

- Enter https://github.com/__username__/bootcamp-jenkins-example.git in the field "Repository URL".
- Make sure you use your own username
- Go to "Build" and select "ADD BUILD STEP". Choose "Invoke top-level Maven targets". Select "M3" in the "Maven Version" dropdown menu.
- Enter "clean build" in the "Goals" field.

What is new is that we are defining a post-build action. This is a action performed after a build has taken place. This can either be successful or not. 

__Note: you need to have a build step definied in order for this to work.__

go to the "Post-build actions" tab and define an email notification

![alt text](/docs/images/Step4/Step4-2.png "Logo Title Text 1")

enter your own mail address or "bootcamp2017-jenkins@mailinator.com" into the mail address

![alt text](/docs/images/Step4/Step4-3.png "Logo Title Text 1")

additionally you can check either boxes to have individual mails sent (not configured) or to send a mail upon broken builds 

Click on "Save".

## Run Deployment Job

- Run the project and take a look at your mail address or https://www.mailinator.com/inbox2.jsp?public_to=bootcamp2017-jenkins to see if the step succeeded. 

Probably not because we did not configure our e-mail settings in Jenkins.

## Configure mail

- Go back to your Jenkins Dashboard if not already there.
- Go to the Jenkins configuration: -> Manage Jenkins ->  System Configuration
- configure the email settings. A good source for this is the gmail SMTP

![alt text](/docs/images/Step4/Step4-4.png "Logo Title Text 1")


The following settings can be used

```
SMTP Server: SMTP.gmail.com
Use SMTP Auth: Yes
Username: full gmail address
password: ************
Use SSL: Yes
Port: 465
```

After configuring you can let Jenkins send a test mail. Please do so to test the configuration

### Two-Factor Authentication

[Two-factor auth](http://stackoverflow.com/questions/26736062/sending-email-fails-when-two-factor-authentication-is-on-for-gmail) requires a different approach.

## Re-run Job

Try the job several times working or not working and behold the notifications (spam) coming in:

![alt text](/docs/images/Step4/notification-1.jpg "Logo Title Text 1")
![alt text](/docs/images/Step4/notification-2.jpg "Logo Title Text 1")






