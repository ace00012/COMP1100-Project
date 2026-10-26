# Project Overview

## Step 1: Data Gathering
User provides a set of randomized data in their desired format.  
  
This enables the AI to learn how to compress the particular format without forming bias on the represented data itself.  
  
The format will always be the same, while the data sent may not be the same in deployment as in training.  
  
For our presentation, we can train a model on raw text (UTF-8).  

## Step 2: Encoding/Decoding
Using provided data, model starts learning to compress this particular format.  
  
Essentially, the model must be able to both compress and decompress.  
  
Two things to consider here: Error rate (must be 0), and compression ratio (try to minimize).  
  
Error rate must be 0 because decompressed data must be the exact same as compressed data; this is how lossless compression works.  
  
Compression ratio needs to be minimized to achieve data efficiency.  

## Step 3: Error Identification/Correction
Now that the model can perform lossless compression, we can introduce artificial errors.  
  
Now we need to minimize both error rate and compression ratio with corrupted data, and the model must always be able to identify corrupted data.  
  
The model must reconfigure itself so that it is still compressing data while also avoiding errors due to corruption. We still must include uncorrupted data, which necessarily must have no error rate after decoding. Otherwise, we will always receive corrupted data if there is an error rate.  
  
It is not possible to reduce error rate to reduce to 0 depending on how many errors there are; if data is completely corrupted, it is impossible to interpret any meaning from it no matter how it was encoded. It is unrealistic to expect completely corrupted data. We will train the model to handle a certain percentage of corrupted data.  
  
We are also considering error identification here. As previously stated, not all errors are correctable, so we need to be able to identify corrupted data.
