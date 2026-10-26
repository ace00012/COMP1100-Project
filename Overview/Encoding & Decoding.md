# Encoding & Decoding

Every bit should be its own input.  
  
We can have our first hidden layer group each byte; each neuron only receives 8 inputs for 128 total neurons on the first layer.  
  
Afterwards, we can have a few hidden layers that take in every previous input, connecting all the data together and allowing compression.  
  
The output should also be 1024 bits so that decoding can give the same result. However, since decoding needs to give us fewer than 1024 bits, we can also give a length output that tells us how many bits are being used. This output can also be used to calculate compression ratio.  
  
Decoding stretches the information back out to 1024 bits, and it must come out the exact same as the original input prior to encoding.  
  
Ultimately, backpropagation must happen after 2 runs: one run encoding, then another decoding.  
