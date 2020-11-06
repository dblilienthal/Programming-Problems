"""
Source: https://leetcode.com/problems/path-crossing/

Given a string path, where path[i] = 'N', 'S', 'E' or 'W', each representing moving one unit north, south, east, or west, respectively. You start at the origin (0, 0) on a 2D plane and walk on the path specified by path.

Return True if the path crosses itself at any point, that is, if at any time you are on a location you've previously visited. Return False otherwise.

Example 1:
Input: path = "NES"
Output: false 
Explanation: Notice that the path doesn't cross any point more than once.

Example2:
Input: path = "NESWW"
Output: true
Explanation: Notice that the path visits the origin twice.

"""



class Solution:
    def isPathCrossing(self, path: str) -> bool:
        
        x_cord = 0
        y_cord = 0
        # Add the staring point to the route
        route = ['00']
        # Create an list of traveled coordiates 
        for direction in path:

            if direction == 'N':
                y_cord += 1
            if direction == 'S':
                y_cord -= 1
            if direction == 'E':
                x_cord += 1
            if direction == 'W':
                x_cord -= 1
            coordiate = str(x_cord)+str(y_cord)    

            if coordiate in route:
                return True
            route.append(coordiate)
        
        return False
        
