# BinaryTree

In this project, you can find two endpoints: one for creating a binary tree given a set of numbers in the url; two for generate de lowest common ancestor of a given binary tree.

In order to execute the project, please download it in an empty folder and build it with the "gradle build" command at any command line. Then, please open the "build/libs" folder, where you can find the runnable jar file generated. Then, type the "java -jar BinaryTree.jar" command. The file executes a spring boot application for a REST service, enabling two endpoints:

http://localhost:8081/binaryTree/createBinaryTree?tree=67,39,28,29,44,76,74,85,83,87 -> As an example for creating a binary tree. This endpoint has only an array of numbers for "tree".

http://localhost:8081/binaryTree/generateLowestCommonAncestor?tree=67,39,28,29,44,76,74,85,83,87&node1=44&node2=85 -> As an example for generating the lowest common ancestor. The requested parameters are "tree" with number values, "node1" and "node2".

You can check another number values. The received response is in json format. These url's can be tested on the navigator.

If there is an issue with the port number, you can change on the "application.properties" file which is into the "src/main/resources" path and reboot the project.
