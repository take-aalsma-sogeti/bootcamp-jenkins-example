click [here](../README.md#table-of-contents) to go back to the main README. 

# Table of Contents
- [jenkins](#jenkins)
  - [Install](#install-instructions)
    - [Java](#java)
    - [Docker](#docker)
    - [Mac](#mac)
    - [Windows](#windows)
  - [Your first run](#first-run)
  - [Changing Ports](#change-port)
  - [next Up](#next-Up)
- [Additional Software](#additional-software)
  - [Git](#git)
  - [Java SDK](#java-sdk)
  - [GitHub Account](#github-account)

***

It would be silly to let you do a Jenkins Bootcamp without the software we are going to use mainly... Below are instructions to download Jenkins, additional software and to set up your GitHub Account.

In this Chapter we will discuss the following topics:

- Installation of Jenkins
- additional Software needed for the bootcamp
- set up a GitHub account and fork the bootcamp example

***

## Jenkins

[../Back to ToC](#table-of-contents)

Jenkins Can be downloaded from [Jenkins.io](http://www.Jenkins.io)

We will be using the LTS version (2.46.1)

![](/docs/images/Install/install-0.png "Download LTS")

From the main website click "Download Jenkins"

![](/docs/images/Install/install-00.png "Choose Version")

You can either click the java War file or select a version to your liking from the dropdown menu.


### install instructions

[../Back to ToC](#table-of-contents)

#### Java

- Run Java Runtime Environment
- use command "java -jar jenkins.war"

#### Docker

[../Back to ToC](#table-of-contents)

- Run Docker Command "run docker pull jenkins"
- Expose a container, exposing it on port
  - "docker run -d -p 49001:8080 -v $PWD/jenkins:/var/jenkins_home:z -t jenkins"
  - for more info click [here](https://wiki.jenkins-ci.org/display/JENKINS/Installing+Jenkins+with+Docker)

#### Mac

[../Back to ToC](#table-of-contents)

Mac Users can use the outdated Mac OS App

- follow instruction from [stisti on GitHub](https://github.com/stisti/jenkins-app)

#### Windows

[../Back to ToC](#table-of-contents)

- Follow the install wizard

The following images represent the install wizard. no real surpises to anyone using a computer.

![](/docs/images/Install/install-1.png "Opem the .exe in RAR")

![](/docs/images/Install/install-2.png "Start wizard")

![](/docs/images/Install/install-3.png "Choose destination folder")

![](/docs/images/Install/install-4.png "Install")

![](/docs/images/Install/install-5.png "Finished")


### first run

[../Back to ToC](#table-of-contents)

After Jenkins has been installed in will open default on "http://localhost:8080"

### change port

[../Back to ToC](#table-of-contents)

If you don't want jenkins to run on 8080 or if another service you use runs on that port you can change it:

- find Jenkins.xml (in the install directory you choose in the wizard)
- search for "--httpPort=8080".
- replace 8080 with the desired port number
- restart jenkins (http://localhost:8080/safeRestart)
- alternatively you can start java on another port using "java -jar jenkins.war -httpPort=8081" (or any other port)

### next up?

[../Back to ToC](#table-of-contents)

You can continue [Configuring Jenkins](/docs/Config.md) and continue installing the additional software later. or continue installing the software doing the configuration later.

***

## additional software

[../Back to ToC](#table-of-contents)

Additionally for this bootcamp you will need Git and Java SDK. If you do not have these find the downloads below. 
Instructions with screens are added in the [Detailed instrcutions](/docs/Install.md)

- Git can be downloaded [here](https://git-scm.com/download/win)
- Java SDK can be downloaded [here](http://www.oracle.com/technetwork/java/javase/downloads/index.html)

### Git

[../Back to ToC](#table-of-contents)

![](/docs/images/Install/git-1.png "Logo Title Text 1")

open the installer and accept the terms and agreements

![](/docs/images/Install/git-2.png "Logo Title Text 1")

Choose a path to install (make a note of this path for configuration later)

![](/docs/images/Install/git-3.png "Logo Title Text 1")

These are the default option. Change to your liking

![](/docs/images/Install/git-4.png "Logo Title Text 1")

Default "Git" change if you want so.

![](/docs/images/Install/git-5.png "Logo Title Text 1")

This is the default option. First option can also be used if you don't using CLI only.

![](/docs/images/Install/git-6.png "Logo Title Text 1")

Use OpenSSH

![](/docs/images/Install/git-7.png "Logo Title Text 1")

Use OpenSSL

![](/docs/images/Install/git-8.png "Logo Title Text 1")

For windows users select the top option.

![](/docs/images/Install/git-9.png "Logo Title Text 1")

Use MinTTY

![](/docs/images/Install/git-10.png "Logo Title Text 1")

Select top two options and click "Install"

![](/docs/images/Install/git-11.png "Logo Title Text 1")

Grab a sip of your coffee. Maybe two... no more though... we don't want you tweaking out on caffeine ^_^

![](/docs/images/Install/git-12.png "Logo Title Text 1")

Voila! uncheck View release notes because noone ever reads those.

### Java SDK

[../Back to ToC](#table-of-contents)


![](/docs/images/Install/Java-1.png "Logo Title Text 1")

Open installer

![](/docs/images/Install/Java-2.png "Logo Title Text 1")

Click Next

![](/docs/images/Install/Java-3.png "Logo Title Text 1")

Select all features to be installed (default). Change path if you want. 
Make a note of the install [path for configuration later]

![](/docs/images/Install/Java-4.png "Logo Title Text 1")

Blindfold yourself (can these add be any bigger....!)

![](/docs/images/Install/Java-5.png "Logo Title Text 1")

Click Close.

## github account

[../Back to ToC](#table-of-contents)

Since this bootcamp uses git it is mandatory to have a github account. If you already have an account you can skip creating one and Fork https://github.com/tsteenbakkers/bootcamp-jenkins-example
- Go to [Github](http://www.github.com) and create a user account.
- go to [the bootcamps repo](https://github.com/tsteenbakkers/bootcamp-jenkins-example)
- Fork the repository into your own account.
- clone the repo locally



### Create account

[../Back to ToC](#table-of-contents)


![](/docs/images/Install/gh-1.png "Logo Title Text 1")

Choose a username, fill in your E-mal address and choose a password

![](/docs/images/Install/gh-2.png "Logo Title Text 1")

Choose the free plan.

![](/docs/images/Install/gh-3.png "Logo Title Text 1")

if you're unsure how to use GitHub it is advised to do the [Hello World](https://guides.github.com/activities/hello-world/) course. Or [check out the video guides](https://www.youtube.com/githubguides)
the actions you need to focus on are
- Fork
- Clone
- Commit
- Push

### Verify Account

[../Back to ToC](#table-of-contents)

![](/docs/images/Install/gh-vf-1.jpg "Logo Title Text 1")

Open your email and click the verify link

![](/docs/images/Install/gh-vf-2.jpg "Logo Title Text 1")

Sign in with yournew credenmtials

![](/docs/images/Install/gh-vf-3.jpg "Logo Title Text 1")

Enjoy GitHub

![](/docs/images/Install/gh-4.png "Logo Title Text 1")

go to https://github.com/tsteenbakkers/bootcamp-jenkins-example
Click "Fork"

![](/docs/images/Install/gh-5.png "Logo Title Text 1")

Watch the awesome animation :)

![](/docs/images/Install/gh-6.png "Logo Title Text 1")

- Click the Dropdown menu
- Use the copy button to get the *.git link used in jenkins later (https://github.com/__username__/bootcamp-jenkins-example.git)
  - use the *.git link in your tool of liking to clone the repo locally
  - Click open in Desktop to open the source in [GitHub Desktop](https://desktop.github.com/)
  - alternatively you can use the GIT CLI and download the zip.
  
  ***
  
  [Back to Top](#table-of-contents)

  click [here](../README.md#table-of-contents) to go back to the main README. 
