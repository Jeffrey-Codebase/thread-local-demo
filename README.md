# thread-local-demo
We are trying to store data individually by each thread and also need the data be accessible everywhere in the thread.
There 3 implementations : 
1. Create the data by each thread and pass it in each function call which will increases the coupling between classes. 
2. Create a static member to store the data which is not thread-safe.
3. Use ThreadLocal. The cleanest and easiest way to achieve our target. 


# How to execute the project
Please run the unit tests separately to compare the output.
