# ParkingApp

Parking App - Final Project in Advanced Java 
at Waukesha County Technical College (WCTC)

The Parking Garage App automates parking and exit functions
at a commercial parking garage. It can be adapted to any parking
garage, and it includes an additional configuration for a
VIP parking garage as an example.

This program uses three design patterns:

1.) factory pattern - implements different parking fees

2.) singleton pattern - used in the FeeStrategyFactoryCommercial
and FeeStrategyFactoryVIP to make a single factory. In both
cases, the "classic Singleton" style is used.

3.) strategy pattern - used to display various types of receipts
