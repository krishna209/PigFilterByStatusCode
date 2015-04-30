# PigFilterByStatusCode

This code is designed to filter only status code 200

Used to filter data according to status code which should be used in grunt

before that register this jar in grunt 

grunt> A = load '/user/mock' using PigCombinedLog.PigApacheLog.CustomCombinedLog() as \
(addr:chararray, logname:chararray, user:chararray, time:chararray, method: chararray, \
uri:chararray, proto:chararray, status:int, bytes:int, referer:chararray, userAgent:chararray);

grunt> filterA = filter A by pigUDF.StatusFilter.StatusFilter(status); 

