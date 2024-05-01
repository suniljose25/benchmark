# write code to write 1000000 line to a file
# each line should contain a random number between 1 and 1000

import random
import tempfile
import time

LINES = 10_000_000;

with tempfile.TemporaryFile("+w") as f:
    start_time = time.time()
    print('Writing to file...')
    for i in range(LINES):
        f.write(str(random.randint(1, 1000)) + '\n')

    #print end time of the script
    difference = time.time() - start_time
    print('Python: Time taken to write ' + str(LINES) + ' lines to file: ' + str(int(difference * 1000)) + 'ms' )
