# write code to write 1000000 line to a file
# each line should contain a random number between 1 and 1000

import random
import time

with open('random_numbers.txt', 'w') as f:
    #print start time of the script
    start_time = time.time()
    print('Start writing to file', start_time)

    for i in range(10000000):
        f.write(str(random.randint(1, 1000)) + '\n')

    #print end time of the script
    difference = time.time() - start_time
    print('End writing to file took time in seconds', difference)
