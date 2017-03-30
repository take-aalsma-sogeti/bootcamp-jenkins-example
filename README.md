# Checkout
- Go to "New item". Enter “Test” as the item name and choose "Freestyle project"
- Go to "Source code management" and select "Git". Enter https://github.com/jeroenschepens/bootcamp-jenkins-example.git in the field "Repository URL".
- Click on "Save".
# Compile
- Go to "New item". Enter “Compile” as the item name and choose "Freestyle project"
- Go to "Source code management" and select "Git". Enter https://github.com/jeroenschepens/bootcamp-jenkins-example.git in the field "Repository URL".
- Got to "Build" and select "ADD BUILD STEP". Choose "Invoke top-level Maven targets". Select "M3" in the "Maven Version" dropdown menu.
- Enter "clean compile" in the "Goals" field.
- Click on "Save".
# Test
- Go to "New item". Enter “Test” as the item name and choose "Freestyle project"
- Go to "Source code management" and select "Git". Enter https://github.com/jeroenschepens/bootcamp-jenkins-example.git in the field "Repository URL".
- Got to "Build" and select "ADD BUILD STEP". Choose "Invoke top-level Maven targets". Select "M3" in the "Maven Version" dropdown menu.
- Enter "clean test" in the "Goals" field.
- Click on "Save".
