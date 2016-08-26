// simiar to a python dictionary, a set of key value pairs
// makes things instantly faster
// using a hashmaps, we can do lookups in constant times

// collisions - there are times when a hash funciton will spit out the same value for twp different inputs
// ex: 0123456 - take the last two digits and divide by ten, round it and you get 6
// ex: 6543216 - take the last two digits and divide by ten, round it and you get 6
// two main ways to fix collisions:  1. change your hash function 2.
//

// Load Factor = Number of Entries / Number of Buckets
// The purpose of a load factor is to give us a sense of how "full" a hash table is.
//  For example, if we're trying to store 10 values in a hash table with 1000 buckets,ana
//  the load factor would be 0.01, and the majority of buckets in the table will be empty
// keys in a map are unique because they belong to a set, a set only holds unique data

// the number 31 is a good value for string key hash function


// derek
// a hash table is a data structure, that offers fast insertion and searching
// limited in size becauase they are based on arrays, but can be resized, but it should be avoided
//
// so key values are assigned to elements in a hash table, using a hash function
// a hash function figures out in which index the values should go, index must fit in the array size
// and cannot override other data in the hash table
//
//a hash function allows finding the value using a calculation instead of searching through the array
// so it retreives one array value at a time, in constant time
//
