This is a Java Build project on SingleThreaded, Multithreaded, and ThreadPool Servers. 

In this project, I compared creating SingleThreaded VS Multithreaded VS ThreadPool by sending 60000 HTTP client requests on the server using Jmeter.

Results:

SingeThreaded VS Multithreaded:

![SingleThreaded](https://github.com/user-attachments/assets/ea20e8fa-defb-48b7-83fc-6f5d64cb4463) VS ![MultiThreaded](https://github.com/user-attachments/assets/ec5aa0fd-977d-4b92-8abf-a4aba4337051)

You can see that the Throughput in both cases does not vary so much. But in Multithreaded deviation is less than SingleThreaded!

But using Java on steroids means ThreadPool: When we use a thread pool, we write our concurrent code in the form of parallel tasks and submit them for execution to an instance of a thread pool. This instance controls several re-used threads for executing these tasks.

![Threadpool](https://github.com/user-attachments/assets/53763a6b-fd6a-4c29-8bc9-666375ee3f9c)






