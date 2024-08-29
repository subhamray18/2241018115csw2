#!/usr/bin/env python3
# -*- coding: utf-8 -*-



#Q_1
import matplotlib.pyplot as plt
person=['A','B','C','D','E','F','G','E','F','G','H','I','J','K','L']
age=[43,21,25,42,57,59,41,46,21,44,42]
gl=[99,65,79,75,87,81,80,78,66,82,79]

#a)
plt.scatter(age,gl,color='red',edgecolors='black')
plt.xlabel('Age(X)')
plt.title('Age VS Glucose Level')
plt.ylabel('Glucose Level(Y)')
for i,g in zip(person,zip(age,gl)):
    plt.annotate(f'{i}:{g}', g)
plt.show()
#b)
def mean(x):
    return sum(x)/len(x)
def variance(x):
    xm=mean(x)
    l=[(a-xm)**2 for a in x]
    return sum(l)/(len(x)-1)
def std(x):
    return variance(x)**0.5
def cov(x,y):
    assert len(x)==len(y)
    xm=mean(x)
    ym=mean(y)
    l=[(xi-xm)*(yi-ym) for xi,yi in zip(x,y)]
    return sum(l)/(len(x)-1)
def corr(x,y):
    return cov(x,y)/(std(x)*std(y))
if corr(age, gl)<0:
    print(f'The correlation coefficient {corr(age,gl)} implies a negative correlation, that means if one value increases, the other decreases.')
elif corr(age, gl)>0:
    print(f'The correlation coefficient {corr(age,gl)} implies a positive correlation, that means if one value increases, the other also increases.')
else:
    print(f'The correlation coefficient {corr(age,gl)} implies a no correlation, that means if two values are not related to one another.')

#2
def inv_cdf(mu,sigma,tol,p):
    hi=10
    lo=-10
    mid=0
    while (hi-lo)>tol:
        mid=(hi+lo)/2
        if mid>p:
            hi=mid
        elif mid<p:
            lo=mid
    return mid
n=1000
sigma=15.8
mu=500
p=mu/n
print(1-inv_cdf(mu, sigma, 0.001, 0.95))
def normal_pro(0.95,mu,sigma):
    total pro=1-(p/2)
    inv_cdf(mu, sigma, tol, p)