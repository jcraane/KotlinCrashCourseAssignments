Given the class [course.examples.delegates.java.JpaPersonDao] which is a Spring generated Dao which has five methods. The getPerson method returns null when a person is not found (id != 1).

1. In Java code. Create a CustomPersonDao which throws an exception if the person is not found. The rest of the methods stay the same. Make sure it implements the PersonDao as well since we want to inject it in places where we need a PersonDao.
2. What do you see with delegation in Java
3. Now Create a new Kotlin file in kotlin/course/assignments and implement the same logic but then using Kotlin class delegation. 
