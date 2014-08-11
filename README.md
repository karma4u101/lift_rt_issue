Demonstrates a round trip regression
====================================

This is a striped down example to demonstrate a possible regression in Lift 3.0 as of 2014-08-11.

Run with current (2014-08-11) Lift 3.0-SNAPSHOT (Scala 2.11.1) there is a issue on page reload.
When the page is initialy loaded there are 3 numbered (round trip) texts "There and back again". 
Issue a reload of the page and the first round trip function is not hiting the server (look at logs).

Switch to Lift 3.0-M1 (Scala 2.10.4) and all works as expected i.e all tre texts is displayed even on a page reload.
