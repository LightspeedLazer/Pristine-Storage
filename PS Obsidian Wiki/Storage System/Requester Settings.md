## Passive Requester
[[Requester Settings#Passive Requester|Passive Requesters]] give a network access to their empty space, but wont try to pull items/fluids from [[Provider Settings#Passive Provider|Passive Providers]]. [[Provider Settings#Active Provider|Active Providers]] will try to push their contents into [[Requester Settings#Passive Requester|Passive Requesters]].
>[!example]+ Use cases
>- Storage inventories

>[!check]- Compatibility
>[[Requester Settings#Passive Requester|Passive Requesters]] are only compatible with [[Provider Settings#Passive Provider|Passive Providers]].
## Active Requester
[[Requester Settings#Active Requester|Active Requesters]] will attempt to pull items/fluids from [[Provider Settings#Passive Provider|Passive Providers]] and [[Provider Settings#Active Provider|Active Providers]].
>[!example]+ Use cases
>- Input side of a machine that requires a certain item/fluid to function

>[!check]- Compatibility
[[Requester Settings#Active Requester|Active Requesters]] are only compatible with [[Provider Settings#Passive Provider|Passive Providers]].