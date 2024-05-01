# write code to write 1000000 line to a file
# each line should contain a random number between 1 and 1000

import random
import tempfile
import time

LINES = 10_000_000;

start_time = time.time()

print('Python: Writing to file...', end='')

with tempfile.TemporaryFile("+w") as f:
    arr = []
    for i in range(LINES):
        arr.append(str(random.randint(1, 1000)) + '\n')
    f.write("".join(arr))

    #print end time of the script
    difference = time.time() - start_time
    print('\rPython: Time taken to write ' + str(LINES) + ' lines to file: ' + str(int(difference * 1000)) + 'ms' )
