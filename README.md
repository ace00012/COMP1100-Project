## Machine Learning for Data Efficiency in Wireless Communication

### Group Members
Ethan Campbell  
Austin Embry  
Jonah Jarrett  

### Problem
Wireless communication is utilized in many areas of modern life: cell phones, car radios, satellite TV, Bluetooth, etc. It requires a standard way to symbolize information, and data corruption due to interference must be handled by either preventing corrupt data from being received or by correcting errors. Currently, communication protocols are used to structure data so that a receiver can recognize and receive the data and error correcting codes are used to spot and possibly correct corrupt data. In both of these topics (communication protocols and error correcting codes), data efficiency is prioritized since sending less data than the raw input reduces transmission time. In this instance, data efficiency refers to how much output data is needed for a successful transmission; less output data is more efficient.

### Proposal
Using machine learning with WEKA, we can first train a model to compress data in a way that can be recovered (lossless compression). This accomplishes the issue of symbolizing information and further provides data efficiency. To handle data corruption, the model must be retrained to structure its output such that it is still able to be interpreted with artificial errors added. This acts in the same manner as an error correcting code, but the usage of machine learning enables a level of data efficiency which error correcting codes cannot reach. The model will only use randomized strings of text for training, since the input of plain text should provide an output that represents the same text, and using that output as input should give the same plain text. We must also learn how to use WEKA for this so we can develop our models correctly.

### Timeline
- **Week 1:** WEKA research, start on lossless compression model
- **Week 2:** Complete lossless compression model, begin error correction model
- **Week 3:** Finalize error correction model, gather final test cases on model
