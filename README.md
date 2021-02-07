---
page_type: sample
languages:
- java
- javascript
products:
- maven 

---

##<a id="Running"></a>Running the Code Sample


1. Install [Project Lombok](http://projectlombok.org/). Lombok is used to generate constructors, getters, setters in the project. Once you have downloaded the lombok.jar file, double-click it to install it or install it from the command line. 
2. If Eclipse is open, close it and restart it to load Lombok.
3. In Eclipse, on the **File** menu, click **Import**.
4. In the **Import** window, click **Git**, click **Projects from Git**, and then click **Next**. 
5. On the **Select Repository Source** screen, click **Clone URI**.
6. On the **Source Git Repository** screen, in the **URI** box, enter `https://github.com/kksingh029/todoList.git`, and then click **Next**.
7. On the **Branch Selection** screen, ensure that **development** is selected, and then click **Next**.
8. On the **Local Destination** screen, click **Browse** to select a folder where the repository can be copied, and then click **Next**.
9. On the **Select a wizard to use for importing projects** screen, ensure that **Import existing projects** is selected, and then click **Next**.
10. On the **Import Projects** screen, and then click **Finish**. The todoList project contains the todoList Java SDK, which we will add as a dependency instead.

11. In **Project Explorer**, right click the **todo-List**, click **Build Path**, and then click **Configure Build Path**.
12. On the **Java Build Path** screen, in the right pane, select the **Libraries** tab, and then click **Add External JARs**. Navigate to the location of the lombok.jar file, and click **Open**, and then click **OK**.
13. Use step 12 to open the **Properties** window again, and then in the left pane click **Targeted Runtimes**.
14. On the **Targeted Runtimes** screen, click **New**, select **Jetty v9.0**, and then click **OK**.
15. Use step 12 to open the **Properties** window again, and then in the left pane click **Project Facets**.
16. On the **Project Facets** screen, select **Dynamic Web Module** and **Java**, and then click **OK**.
17. On the **Servers** tab at the bottom of the screen, right-click **Jetty v9.0 Server at localhost** and then click **Add and Remove**.
18. On the **Add and Remove** window, move **todo-List** to the **Configured** box, and then click **Finish**. 
19. In the **Server** tab, right-click **Jetty v9.0 Server at localhost**, and then click **Restart**.
20. In a browser, navigate to `http://localhost:8080/todo-List/` and start adding to your task list. Note that if you changed your default port values, change `8080` to the value you selected.
21. "mvn jetty:run" can also start the project 

