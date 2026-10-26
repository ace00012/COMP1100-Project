# Data Gathering

When the data is processed by the neural network, it should be completely in binary since this is how data will ultimately be transmitted.  
  
The model needs a flag for each input that tells if it should be encoded or decoded, this way it can properly decide how it is going to process the information.  
  
We should use fixed length packets of 1024 bits. This is easier to work with than variable-length packets.
